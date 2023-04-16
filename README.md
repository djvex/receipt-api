# Instructions

## Dependencies
- Java 17 (I used this mostly out of convenience on my local Macbook)
- Docker (optional if you have Java 17)

### 1. Clone the repo
```shell
gh repo clone djvex/receipt-api
```

### 2. To download the dependencies, build, the project, and start it. In your shell you can do:
```shell
./mvnw spring-boot:run
```

### 3, If you have docker, you can build and run the image afterward with:
```shell
docker build --tag receipt-api .
docker run receipt-api
```

To get a receipt make a `POST` to `http://localhost:8080/receipt` with a JSON request body representing the `cart` with a list of `items` and `coupons` like so.
```shell
{
  "items": [
    {
      "itemName": "H-E-B Two Bite Brownies",
      "sku": 85294241,
      "isTaxable": false,
      "ownBrand": true,
      "price": 3.61
    },
    {
      "itemName": "Halo Top Vanilla Bean Ice Cream",
      "sku": 95422042,
      "isTaxable": false,
      "ownBrand": false,
      "price": 3.31
    },
    {
      "itemName": "H-E-B Select Ingredients Creamy Creations Vanilla Bean Ice Cream",
      "sku": 64267055,
      "isTaxable": true,
      "ownBrand": true,
      "price": 9.83
    },
    {
      "itemName": "Aveeno Daily Moisturizing Body Wash",
      "sku": 12821859,
      "isTaxable": true,
      "ownBrand": false,
      "price": 5.11
    },
    {
      "itemName": "Hershey's Chocolate Syrup",
      "sku": 23991994,
      "isTaxable": false,
      "ownBrand": false,
      "price": 9.47
    },
    {
      "itemName": "GoGo squeeZ Applesauce Pouches",
      "sku": 30224576,
      "isTaxable": false,
      "ownBrand": false,
      "price": 7.58
    },
    {
      "itemName": "H-E-B Organics Unbleached All Purpose Flour",
      "sku": 50338388,
      "isTaxable": true,
      "ownBrand": true,
      "price": 5.89
    },
    {
      "itemName": "Heritage Ranch by H-E-B Basked Pumpkin Dog Treats",
      "sku": 31001002,
      "isTaxable": true,
      "ownBrand": true,
      "price": 5.11
    },
    {
      "itemName": "KODI Red Matte Stainless Steel Low Ball Tumbler",
      "sku": 87467463,
      "isTaxable": false,
      "ownBrand": true,
      "price": 1.5
    },
    {
      "itemName": "H-E-B Artisan Yellow Cheddar Cheese",
      "sku": 40514710,
      "isTaxable": true,
      "ownBrand": true,
      "price": 11.48
    },
    {
      "itemName": "H-E-B Sugar Rush Dream Melon",
      "sku": 56037921,
      "isTaxable": true,
      "ownBrand": true,
      "price": 8.4
    },
    {
      "itemName": "H-E-B Chocolate Milk",
      "sku": 49057828,
      "isTaxable": true,
      "ownBrand": true,
      "price": 6.42
    },
    {
      "itemName": "Oroweat Extra Crisp Fork-Split English Muffins",
      "sku": 92374672,
      "isTaxable": true,
      "ownBrand": false,
      "price": 2.83
    },
    {
      "itemName": "H-E-B Organics Frozen Berry Blend",
      "sku": 73354627,
      "isTaxable": true,
      "ownBrand": true,
      "price": 4.77
    },
    {
      "itemName": "H-E-B Select Ingredients Unsweetened Coconut Sparkling Water 12 oz Cans",
      "sku": 65290137,
      "isTaxable": true,
      "ownBrand": true,
      "price": 14.18
    },
    {
      "itemName": "H-E-B Spaghetti",
      "sku": 30532705,
      "isTaxable": false,
      "ownBrand": true,
      "price": 4.86
    },
    {
      "itemName": "H-E-B Prime 1 Beef Brisket Steak Burgers, 2 ct",
      "sku": 29846569,
      "isTaxable": true,
      "ownBrand": true,
      "price": 8.65
    },
    {
      "itemName": "Tofurky",
      "sku": 61411728,
      "isTaxable": true,
      "ownBrand": false,
      "price": 8.15
    },
    {
      "itemName": "H-E-B Select Ingredients Chocolate Hummus",
      "sku": 58267213,
      "isTaxable": true,
      "ownBrand": true,
      "price": 9.29
    },
    {
      "itemName": "Heinz Tomato Ketchup",
      "sku": 73018836,
      "isTaxable": false,
      "ownBrand": false,
      "price": 12.8
    },
    {
      "itemName": "H-E-B Queso Classic, Mild",
      "sku": 12338101,
      "isTaxable": false,
      "ownBrand": true,
      "price": 12.41
    },
    {
      "itemName": "Central Market Mild Peach Salsa",
      "sku": 99828459,
      "isTaxable": false,
      "ownBrand": true,
      "price": 1.16
    },
    {
      "itemName": "H-E-B Natural Ground Bison",
      "sku": 14064431,
      "isTaxable": false,
      "ownBrand": true,
      "price": 12.52
    },
    {
      "itemName": "H-E-B Texas Style Unsweet Tea",
      "sku": 77915014,
      "isTaxable": true,
      "ownBrand": true,
      "price": 7.04
    },
    {
      "itemName": "H-E-B Original Bacon",
      "sku": 48067887,
      "isTaxable": false,
      "ownBrand": true,
      "price": 7.15
    },
    {
      "itemName": "H-E-B Cotton Swabs with Paper Sticks",
      "sku": 48426066,
      "isTaxable": false,
      "ownBrand": true,
      "price": 9.72
    },
    {
      "itemName": "Central Market Organics Mushroom Pasta Sauce",
      "sku": 64474859,
      "isTaxable": true,
      "ownBrand": true,
      "price": 7.12
    },
    {
      "itemName": "H-E-B Vegetable Medley",
      "sku": 11407191,
      "isTaxable": true,
      "ownBrand": true,
      "price": 4.81
    },
    {
      "itemName": "Beyond Meat Beyond Beef Plant Based Ground",
      "sku": 99657156,
      "isTaxable": false,
      "ownBrand": false,
      "price": 3.81
    },
    {
      "itemName": "H-E-B Wild Caught Sockeye Salmon Fillet",
      "sku": 75821377,
      "isTaxable": true,
      "ownBrand": true,
      "price": 12.43
    }
  ],
	"coupons": [
    {
      "couponName": "Brownie Discount",
      "appliedSku": 85294241,
      "discountPrice": 0.79
    },
    {
      "couponName": "Tofurky Discount",
      "appliedSku": 61411728,
      "discountPrice": 1.01
    },
    {
      "couponName": "Spaghetti Discount",
      "appliedSku": 30532705,
      "discountPrice": 1.83
    },
    {
      "couponName": "Seafood Discount",
      "appliedSku": 21411389,
      "discountPrice": 1.50
    }
  ]
}

```



You can also get a receipt without any `coupons` applied by sending a `POST` and omitting the `coupons` array in the JSON body.
```shell
curl --request POST \
  --url http://localhost:8080/receipt \
  --header 'Content-Type: application/json' \
  --data '{
  "items": [
    {
      "itemName": "H-E-B Two Bite Brownies",
      "sku": 85294241,
      "isTaxable": false,
      "ownBrand": true,
      "price": 3.61
    },
    {
      "itemName": "Halo Top Vanilla Bean Ice Cream",
      "sku": 95422042,
      "isTaxable": false,
      "ownBrand": false,
      "price": 3.31
    },
    {
      "itemName": "H-E-B Select Ingredients Creamy Creations Vanilla Bean Ice Cream",
      "sku": 64267055,
      "isTaxable": true,
      "ownBrand": true,
      "price": 9.83
    },
    {
      "itemName": "Aveeno Daily Moisturizing Body Wash",
      "sku": 12821859,
      "isTaxable": true,
      "ownBrand": false,
      "price": 5.11
    },
    {
      "itemName": "Hershey'\''s Chocolate Syrup",
      "sku": 23991994,
      "isTaxable": false,
      "ownBrand": false,
      "price": 9.47
    },
    {
      "itemName": "GoGo squeeZ Applesauce Pouches",
      "sku": 30224576,
      "isTaxable": false,
      "ownBrand": false,
      "price": 7.58
    },
    {
      "itemName": "H-E-B Organics Unbleached All Purpose Flour",
      "sku": 50338388,
      "isTaxable": true,
      "ownBrand": true,
      "price": 5.89
    },
    {
      "itemName": "Heritage Ranch by H-E-B Basked Pumpkin Dog Treats",
      "sku": 31001002,
      "isTaxable": true,
      "ownBrand": true,
      "price": 5.11
    },
    {
      "itemName": "KODI Red Matte Stainless Steel Low Ball Tumbler",
      "sku": 87467463,
      "isTaxable": false,
      "ownBrand": true,
      "price": 1.5
    },
    {
      "itemName": "H-E-B Artisan Yellow Cheddar Cheese",
      "sku": 40514710,
      "isTaxable": true,
      "ownBrand": true,
      "price": 11.48
    },
    {
      "itemName": "H-E-B Sugar Rush Dream Melon",
      "sku": 56037921,
      "isTaxable": true,
      "ownBrand": true,
      "price": 8.4
    },
    {
      "itemName": "H-E-B Chocolate Milk",
      "sku": 49057828,
      "isTaxable": true,
      "ownBrand": true,
      "price": 6.42
    },
    {
      "itemName": "Oroweat Extra Crisp Fork-Split English Muffins",
      "sku": 92374672,
      "isTaxable": true,
      "ownBrand": false,
      "price": 2.83
    },
    {
      "itemName": "H-E-B Organics Frozen Berry Blend",
      "sku": 73354627,
      "isTaxable": true,
      "ownBrand": true,
      "price": 4.77
    },
    {
      "itemName": "H-E-B Select Ingredients Unsweetened Coconut Sparkling Water 12 oz Cans",
      "sku": 65290137,
      "isTaxable": true,
      "ownBrand": true,
      "price": 14.18
    },
    {
      "itemName": "H-E-B Spaghetti",
      "sku": 30532705,
      "isTaxable": false,
      "ownBrand": true,
      "price": 4.86
    },
    {
      "itemName": "H-E-B Prime 1 Beef Brisket Steak Burgers, 2 ct",
      "sku": 29846569,
      "isTaxable": true,
      "ownBrand": true,
      "price": 8.65
    },
    {
      "itemName": "Tofurky",
      "sku": 61411728,
      "isTaxable": true,
      "ownBrand": false,
      "price": 8.15
    },
    {
      "itemName": "H-E-B Select Ingredients Chocolate Hummus",
      "sku": 58267213,
      "isTaxable": true,
      "ownBrand": true,
      "price": 9.29
    },
    {
      "itemName": "Heinz Tomato Ketchup",
      "sku": 73018836,
      "isTaxable": false,
      "ownBrand": false,
      "price": 12.8
    },
    {
      "itemName": "H-E-B Queso Classic, Mild",
      "sku": 12338101,
      "isTaxable": false,
      "ownBrand": true,
      "price": 12.41
    },
    {
      "itemName": "Central Market Mild Peach Salsa",
      "sku": 99828459,
      "isTaxable": false,
      "ownBrand": true,
      "price": 1.16
    },
    {
      "itemName": "H-E-B Natural Ground Bison",
      "sku": 14064431,
      "isTaxable": false,
      "ownBrand": true,
      "price": 12.52
    },
    {
      "itemName": "H-E-B Texas Style Unsweet Tea",
      "sku": 77915014,
      "isTaxable": true,
      "ownBrand": true,
      "price": 7.04
    },
    {
      "itemName": "H-E-B Original Bacon",
      "sku": 48067887,
      "isTaxable": false,
      "ownBrand": true,
      "price": 7.15
    },
    {
      "itemName": "H-E-B Cotton Swabs with Paper Sticks",
      "sku": 48426066,
      "isTaxable": false,
      "ownBrand": true,
      "price": 9.72
    },
    {
      "itemName": "Central Market Organics Mushroom Pasta Sauce",
      "sku": 64474859,
      "isTaxable": true,
      "ownBrand": true,
      "price": 7.12
    },
    {
      "itemName": "H-E-B Vegetable Medley",
      "sku": 11407191,
      "isTaxable": true,
      "ownBrand": true,
      "price": 4.81
    },
    {
      "itemName": "Beyond Meat Beyond Beef Plant Based Ground",
      "sku": 99657156,
      "isTaxable": false,
      "ownBrand": false,
      "price": 3.81
    },
    {
      "itemName": "H-E-B Wild Caught Sockeye Salmon Fillet",
      "sku": 75821377,
      "isTaxable": true,
      "ownBrand": true,
      "price": 12.43
    }
  ]
	
}
'
```
