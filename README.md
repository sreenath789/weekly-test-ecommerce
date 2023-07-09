# Geekster Weekly Test Ecommerce
Frameworks and Language used
Spring Boot

Data Flow
#### Controller
###### User ---> addUsers()--add the users,getUserById(int id)--get the user by id
###### Product ---> addProducts()--add the products,getProductByCategory(String category)--get the products by category,deleteProduct(int id)--delete the product by id
###### Address --> addAdress()--add the address
###### Order --> addOrder()--add the order , getOrder(int id)--get Order by id
 

#### Services
it is autowired in Controller so that it can perform requied bussiness logic

#### Repository
It Consists data which is posted from swagger documentation. It is autowired in Service application