package com.xworkz.collections_crud_operations.ecom_mgmt.impl;

import com.xworkz.collections_crud_operations.ecom_mgmt.constants.*;
import com.xworkz.collections_crud_operations.ecom_mgmt.dto.CustomerDTO;
import com.xworkz.collections_crud_operations.ecom_mgmt.dto.ProductDTO;
import com.xworkz.collections_crud_operations.ecom_mgmt.ecom.ECommerce;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlipKartImpl implements ECommerce {

    private int productId;
    private int proIndex;
    private int proSize;
    private int proTotalSize;
    private ProductDTO[] products = new ProductDTO[0];

    private int customerId;
    private int cusIndex;
    private int cusSize;
    private int cusTotalSize;
    private CustomerDTO[] customers = new CustomerDTO[0];

    private String websiteName;

    Scanner sc = new Scanner(System.in);

    public FlipKartImpl(String websiteName){
        this.websiteName = websiteName;
    }

    @Override
    public String toString() {
        return "Ecom{websiteName : '" + websiteName + '\'' +
                ", products : " + Arrays.toString(products) +
                ", customers : " + Arrays.toString(customers) +
                '}';
    }

    @Override
    public void options(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To add products/customer \n" +
                    "2 -> To get product/customer details\n" +
                    "3 -> To delete product/customer\n" +
                    "4 -> To update product/customers\n" +
                    "5 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<5){
                switch (choice){
                    case 1 :addOptions();
                        break;
                    case 2 :getDetailsOptions();
                        break;
                    case 3 :deleteOptions();
                        break;
                    case 4 : updateOptions();
                        break;
                }
            }else {
                break;
            }
        }
    }

    @Override
    public void addOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To add new products\n" +
                    "2 -> To add new customers\n" +
                    "3 -> To create both product and customer\n" +
                    "4 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<4){
                switch (choice){
                    case 1 :addProducts();
                        break;
                    case 2 :addCustomers();
                        break;
                    case 3 :addProductAndCustomer();
                        break;
                }
            }else {
                break;
            }
        }
    }

    @Override
    public void getDetailsOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To get details of products\n" +
                    "2 -> To get details of customers\n" +
                    "3 -> To get details of both product and customer\n" +
                    "4 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<4){
                switch (choice){
                    case 1 :fetchProductOptions();
                        break;
                    case 2 :fetchCustomerOptions();
                        break;
                    case 3 :getProductsAndCustomers();
                        break;
                }
            }else {
                break;
            }
        }
    }

    private void fetchCustomerOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To get details of customer\n" +
                    "2 -> To fetch customer name by Id\n" +
                    "3 -> To fetch customer contact number by Id\n" +
                    "4 -> To fetch customer address by name\n" +
                    "5 -> To fetch customer email by name\n" +
                    "6 -> To fetch customer gender by name\n" +
                    "7 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<7){
                switch (choice){
                    case 1 :getCustomers();
                        break;
                    case 2 :fetchCustomerName();
                        break;
                    case 3 :fetchCustomerContactNumber();
                        break;
                    case 4 : fetchCustomerAddress();
                        break;
                    case 5 : fetchCustomerEmail();
                        break;
                    case 6 : fetchCustomerGender();
                        break;
                }
            }else {
                break;
            }
        }
    }

    private void fetchProductOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To get details of product\n" +
                    "2 -> To fetch product name by Id\n" +
                    "3 -> To fetch product price by Id\n" +
                    "4 -> To fetch product quantity by Id\n" +
                    "5 -> To fetch product mfg date by name\n" +
                    "6 -> To fetch product type by Id\n" +
                    "7 -> To fetch product category by Id\n" +
                    "8 -> To fetch product brand by Id\n" +
                    "9 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<9){
                switch (choice){
                    case 1 :getProducts();
                        break;
                    case 2 :fetchProductName();
                        break;
                    case 3 :fetchProductPrice();
                        break;
                    case 4 : fetchProductQuantity();
                        break;
                    case 5 : fetchProductManufacturingDate();
                        break;
                    case 6 : fetchProductType();
                        break;
                    case 7 : fetchProductCategoryByProductId();
                        break;
                    case 8 : fetchProductBrandByProductId();
                        break;
                }
            }else {
                break;
            }
        }
    }

    @Override
    public void updateOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To update details of products\n" +
                    "2 -> To update details of customers\n" +
                    "3 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<3){
                switch (choice){
                    case 1 :updateProductOptions();
                        break;
                    case 2 :updateCustomerOptions();
                        break;
                }
            }else {
                break;
            }
        }
    }

    private void updateProductOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To update product name by Id\n" +
                    "2 -> To update product price number by Id\n" +
                    "3 -> To update product quantity by Id\n" +
                    "4 -> To update product type by Id\n" +
                    "5 -> To update product category by Id\n" +
                    "6 -> To update product brand by Id\n" +
                    "7 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<7){
                switch (choice){
                    case 1 :updateProductName();
                        break;
                    case 2 :updateProductPrice();
                        break;
                    case 3 :updateProductQuantity();
                        break;
                    case 4 : updateProductType();
                        break;
                    case 5 : updateProductCategory();
                        break;
                    case 6 : updateProductBrand();
                        break;
                }
            }else {
                break;
            }
        }
    }

    private void updateCustomerOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To update customer name by Id\n" +
                    "2 -> To update customer contact number by Id\n" +
                    "3 -> To update customer address by Id\n" +
                    "4 -> To update customer email by Id\n" +
                    "5 -> To update customer gender by Id\n" +
                    "6 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<6){
                switch (choice){
                    case 1 :updateCustomerName();
                        break;
                    case 2 :updateCustomerContactNumber();
                        break;
                    case 3 :updateCustomerAddress();
                        break;
                    case 4 : updateCustomerEmail();
                        break;
                    case 5 : updateCustomerGender();
                        break;
                }
            }else {
                break;
            }
        }
    }

    @Override
    public void deleteOptions(){
        while (true){
            System.out.println("Enter the choice : ");
            System.out.println("1 -> To delete products\n" +
                    "2 -> To delete customers\n" +
                    "3 -> To delete both product and customer\n" +
                    "4 -> Exit");
            int choice = sc.nextInt();
            if (choice>0 && choice<4){
                switch (choice){
                    case 1 :deleteProduct();
                        break;
                    case 2 :deleteCustomer();
                        break;
                    case 3 :deleteProductAndCustomer();
                        break;
                }
            }else {
                break;
            }
        }
    }

    private void addCustomers(){
        System.out.println("Enter the number of customers to be created : ");
        int s = sc.nextInt();
        cusTotalSize = cusSize + s;
        customers = Arrays.copyOf(customers,cusTotalSize);
        for (int i = cusSize; i < cusTotalSize;i++){
            CustomerDTO customerDTO = new CustomerDTO();
            provideCustomerDetails(customerDTO);
            customers[i] = customerDTO;
            cusSize++;
        }
    }

    private void addProducts(){
        System.out.println("Enter the number of products to be created : ");
        int s = sc.nextInt();
        proTotalSize = proSize + s;
        products = Arrays.copyOf(products,proTotalSize);
        for (int i = proSize; i < proTotalSize;i++){
            ProductDTO productDTO = new ProductDTO();
            provideProductDetails(productDTO);
            products[i] = productDTO;
            proSize++;
        }
    }

    private void addProductAndCustomer(){
        addProducts();
        addCustomers();
    }

    private void provideProductDetails(ProductDTO product){

        product.setProductId(++productId);

        System.out.println("Enter the product name : ");
        product.setProductName(sc.next().toLowerCase());

        System.out.println("Enter the product type from the values below : ");
        for(ProductType productType : ProductType.values()){
            System.out.print(productType + ", ");
        }
        System.out.println();
        //System.out.println("[GROCERY, ELECTRONICS, FASHION, APPLIANCES, TOYS, FURNITURE]");
        product.setType(ProductType.valueOf(sc.next().toUpperCase()));
        System.out.println("Enter the product category from the values below : ");
        switch (product.getType()){
            case GROCERY:  for (GroceryCategory groceryCategory : GroceryCategory.values()){
                                System.out.print(groceryCategory + ", ");
                            }
                            System.out.println();
                            //System.out.println("[STAPLES, SNACKS, BEVERAGES, DIARY, PACKAGEDFOOD, HOUSEHOLDCARE]");
                            product.setGroceryCategory(GroceryCategory.valueOf(sc.next().toUpperCase()));

                            System.out.println("Enter the product brand from the values below : ");
                            for(GroceryBrand brand : GroceryBrand.values()){
                                System.out.print(brand + ", ");
                            }
                            System.out.println();
                            //System.out.println("[AASHIRWAAD, NANDINI, TATA, BINGO, LAYS, PARLE, SUNFEAST, MAGGI]");
                            product.setGroceryBrand(GroceryBrand.valueOf(sc.next().toUpperCase()));
                            break;

            case ELECTRONICS: for (ElectronicsCategory electronicsCategory : ElectronicsCategory.values()){
                                                System.out.print(electronicsCategory + ", ");
                              }
                              System.out.println();
                              //System.out.println("[MOBILES, LAPTOPS, SPEAKERS, CAMERAS, DESKTOPS]");
                              product.setElectronicsCategory(ElectronicsCategory.valueOf(sc.next().toUpperCase()));

                              System.out.println("Enter the product brand from the values below : ");
                              for(ElectronicsBrand brand : ElectronicsBrand.values()){
                                  System.out.print(brand + ", ");
                              }
                              System.out.println();
                              //System.out.println("[MI, VIVO, REALME, APPLE, SAMSUNG, OPPO, ASUS]");
                              product.setElectronicsBrand(ElectronicsBrand.valueOf(sc.next().toUpperCase()));
                              break;

            case FASHION:   for (FashionCategory fashionCategory : FashionCategory.values()){
                                 System.out.print(fashionCategory + ", ");
                             }
                             System.out.println();
                             //System.out.println("[TOPWEAR, BOTTOMWEAR, FOOTWEAR, ESSENTIALS, ACCESSORIES, WATCHES]");
                             product.setFashionCategory(FashionCategory.valueOf(sc.next().toUpperCase()));

                             System.out.println("Enter the product brand from the values below : ");
                             for(FashionBrand brand : FashionBrand.values()){
                                 System.out.print(brand + ", ");
                             }
                             System.out.println();
                             //System.out.println("[NIKE, ADIDAS, PUMA, REEBOK, FOSSIL, TITAN, CASIO]");
                             product.setFashionBrand(FashionBrand.valueOf(sc.next().toUpperCase()));
                             break;

            case APPLIANCES: for (AppliancesCategory appliancesCategory : AppliancesCategory.values()){
                                 System.out.print(appliancesCategory + ", ");
                             }
                             System.out.println();
                             //System.out.println("[TV, AC, REFRIGERATOR, WASHINGMACHINE, GRINDER, MIXER, OVEN]");
                             product.setAppliancesCategory(AppliancesCategory.valueOf(sc.next().toUpperCase()));

                             System.out.println("Enter the product brand from the values below : ");
                             for(AppliancesBrand brand : AppliancesBrand.values()){
                                 System.out.print(brand + ", ");
                             }
                             System.out.println();
                             //System.out.println("[SAMSUNG, LG, GODREJ, WHIRLPOOL, PHILIPS, IFB]");
                             product.setAppliancesBrand(AppliancesBrand.valueOf(sc.next().toUpperCase()));
                             break;

            case TOYS: for (ToysCategory toysCategory : ToysCategory.values()){
                           System.out.print(toysCategory + ", ");
                       }
                       System.out.println();
                       //System.out.println("[BOARDGAMES, PUZZLES, REMOTECONTROL, ACTIONGAMES, CARDGAMES, GUNS, DOLLS]");
                       product.setToysCategory(ToysCategory.valueOf(sc.next().toUpperCase()));

                       System.out.println("Enter the product brand from the values below : ");
                       for(ToysBrand brand : ToysBrand.values()){System.out.print(brand + ", ");
                       }
                       System.out.println();
                       //System.out.println("[LEGO, NERF, DISNEY, HOTWHEELS, BARBIE]");
                       product.setToysBrand(ToysBrand.valueOf(sc.next().toUpperCase()));
                       break;

            case FURNITURE: for (FurnitureCategory furnitureCategory : FurnitureCategory.values()){
                                System.out.print(furnitureCategory + ", ");
                            }
                            System.out.println();
                            //System.out.println("[MOBILES, LAPTOPS, SPEAKERS, CAMERAS, DESKTOPS]");
                            product.setFurnitureCategory(FurnitureCategory.valueOf(sc.next().toUpperCase()));

                            System.out.println("Enter the product brand from the values below : ");
                            for(FurnitureBrand brand : FurnitureBrand.values()){
                                System.out.print(brand + ", ");
                            }
                            System.out.println();
                            //System.out.println("[NIKE, ADIDAS, PUMA, REEBOK, FOSSIL, TITAN, CASIO]");
                            product.setFurnitureBrand(FurnitureBrand.valueOf(sc.next().toUpperCase()));
                            break;
        }

        System.out.println("Enter the product price : ");
        product.setPrice(sc.nextDouble());

        System.out.println("Enter the product quantity : ");
        product.setQuantity(sc.nextInt());

        product.setManufactureDate(LocalDate.now());
        System.out.println(createProduct(product));
    }

    private void provideCustomerDetails(CustomerDTO customer) {

        customer.setCustomerId(++customerId);

        System.out.println("Enter the customer name : ");
        customer.setCustomerName(sc.next().toLowerCase());


        System.out.println("Enter the customer contact number : ");
        customer.setPhoneNumber(sc.nextLong());

        System.out.println("Enter the customer address : ");
        customer.setAddress(sc.next().toLowerCase());

        System.out.println("Enter the customer email : ");
        customer.setEmail(sc.next().toLowerCase());

        System.out.println("Enter the patient gender from the values below : ");
        for (Gender gender : Gender.values()) {
            System.out.print(gender + ", ");
        }
        System.out.println();
        //System.out.println("[MALE, FEMALE, TRANSGENDER, OTHERS]");
        customer.setGender(Gender.valueOf(sc.next().toUpperCase()));
        System.out.println(createCustomer(customer));
    }

    private String createProduct(ProductDTO product){
        if(product != null){
            if (proIndex < products.length){
                this.products[proIndex++] = product;
                return "Product data has been saved\n";
            }else {
                return  "No more space\n";
            }
        }else {
            return "Product is null\n";
        }
    }

    private String createCustomer(CustomerDTO customer){
        if(customer != null){
            if (cusIndex < customers.length){
                this.customers[cusIndex++] = customer;
                return "Customer data has been saved\n";
            }else {
                return  "No more space\n";
            }
        }else {
            return "Customer is null\n";
        }
    }

    public void getAllProducts(){
        System.out.println("Product Details : ");
        for(ProductDTO productDTO : products){
            System.out.println(productDTO);
        }
    }

    public void getAllCustomers(){
        System.out.println("Customer Details : ");
        for(CustomerDTO customerDTO : customers){
            System.out.println(customerDTO);
        }
    }

    private void getProducts(){
        if (proIndex > 0){
            System.out.println("Product details : ");
            for (int i=0;i<proIndex;i++){
                System.out.println(products[i]);
            }
        }else {
            System.out.println("There are no products");
        }
    }

    private void getCustomers(){
        if (cusIndex > 0 ){
            System.out.println("Customer details : ");
            for (int i=0;i<cusIndex;i++){
                System.out.println(customers[i]);
            }
        }else {
            System.out.println("There are no customers");
        }
    }

    private void getProductsAndCustomers(){
        getProducts();
        getCustomers();
    }

    private boolean checkCustomerId(int id){
        for(CustomerDTO customer : customers){
            if (customer.getCustomerId() == id){
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }

    private boolean checkProductId(int id){
        for(ProductDTO product : products){
            if (product.getProductId() == id){
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }


    private String deleteCustomerById(int id){
        int newIndex = 0;
        if(checkCustomerId(id)){
            for (int i=0;i < cusIndex;i++){
                if (customers[i].getCustomerId() == id){
                    System.out.println("Customer to be deleted : " + customers[i]);
                }
                if (!(customers[i].getCustomerId() == id)){
                    customers[newIndex++] = customers[i];
                }
            }
            cusSize--;
            cusIndex--;
            customers = Arrays.copyOf(customers,customers.length-1);
            //System.out.println(Arrays.toString(customers));
            return "Customer with Id : " + id + " has been deleted\n";
        }
        else{
            return "Customer not found\n";
        }
    }

    private void deleteCustomer(){
        System.out.println("Enter the Customer Id to be deleted : ");
        int id = sc.nextInt();
        System.out.println(deleteCustomerById(id));
        getCustomers();
    }

    private String deleteProductsById(int id){
        int newIndex = 0;
        if(checkProductId(id)){
            for (int i=0;i < proIndex;i++){
                if (products[i].getProductId() == id){
                    System.out.println("Product to be deleted : " + products[i]);
                }
                if (!(products[i].getProductId() == id)){
                    products[newIndex++] = products[i];
                }
            }
            proSize--;
            proIndex--;
            products = Arrays.copyOf(products,products.length-1);
            //System.out.println(Arrays.toString(products));
            return "Product with Id : " + id + " has been deleted\n";
        }
        else{
            return "Product not found\n";
        }
    }

    private void deleteProduct(){
        System.out.println("Enter the Product Id to be deleted : ");
        int id = sc.nextInt();
        System.out.println(deleteProductsById(id));
        getProducts();
    }

    private void deleteProductAndCustomer(){
        deleteProduct();
        deleteCustomer();
    }

    private void fetchCustomerName(){
        System.out.println("Enter the customer ID : ");
        System.out.println(getCustomerNameByCustomerID(sc.nextInt()));
    }

    private void fetchCustomerContactNumber(){
        System.out.println("Enter the customer ID : ");
        System.out.println(getCustomerContactNumberByCustomerId(sc.nextInt()));
    }

    private void fetchCustomerAddress(){
        System.out.println("Enter the customer name : ");
        System.out.println(getCustomerAddressByCustomerName(sc.next()));
    }

    private void fetchCustomerEmail(){
        System.out.println("Enter the customer name : ");
        System.out.println(getCustomerEmailByCustomerName(sc.next()));
    }

    private void fetchCustomerGender(){
        System.out.println("Enter the customer name : ");
        System.out.println(getCustomerGenderByCustomerName(sc.next()));
    }

    private String getCustomerNameByCustomerID(int id){
        for(CustomerDTO customer : customers){
            if (customer.getCustomerId() == id){
                return customer.getCustomerName();
            }
        }
        return "ID not found";
    }

    private long getCustomerContactNumberByCustomerId(int id){
        for(CustomerDTO customer : customers){
            if (customer.getCustomerId() == id){
                return customer.getPhoneNumber();
            }
        }
        System.out.println("Not found");
        return 0;
    }

    private String getCustomerAddressByCustomerName(String name){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerName().equals(name.toLowerCase())){
                return customer.getAddress();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private String getCustomerEmailByCustomerName(String name){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerName().equals(name.toLowerCase())){
                return customer.getEmail();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private Gender getCustomerGenderByCustomerName(String name){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerName().equals(name.toLowerCase())){
                return customer.getGender();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private String updateCustomerNameByCustomerId(int customerId,String newName){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerId() == customerId){
                customer.setCustomerName(newName);
                return "Customer Name updated to : " + newName + " for Customer Id : " + customer.getCustomerId();
            }
        }
        return  "Customer not found";
    }

    private String updateContactNoByCustomerId(int customerId,long contactNo){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerId() == customerId){
                customer.setPhoneNumber(contactNo);
                return "Customer Contact Number updated to : " + contactNo + " for Customer Id : " + customer.getCustomerId();
            }
        }
        return "Customer not found";
    }

    private String updateCustomerAddressByCustomerId(int customerId,String address){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerId() == customerId){
                customer.setAddress(address);
                return "Customer address updated to : " + address + " for Customer Id : " + customer.getCustomerId();
            }
        }
        return "Customer not found";
    }

    private String updateCustomerEmailByCustomerId(int customerId,String email){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerId() == customerId){
                customer.setEmail(email);
                return "Customer attender has been changed to : " + email + " for Customer Id : " + customer.getCustomerId();
            }
        }
        return "Customer not found";
    }

    private String updateCustomerGenderByCustomerId(int customerId,Gender gender){
        for (CustomerDTO customer : customers){
            if (customer.getCustomerId() == customerId){
                customer.setGender(gender);
                return "Customer Gender has been changed to : " + gender + " for Customer Id : " + customer.getCustomerId();
            }
        }
        return "Customer not found";
    }

    private void updateCustomerName(){
        System.out.println("Enter the customer Id : ");
        int id = sc.nextInt();
        if (checkCustomerId(id)){
            System.out.println("Enter the customer new name : ");
            String name = sc.next();
            if (name != null){
                System.out.println(updateCustomerNameByCustomerId(id,name.toLowerCase()));
            }
        }else {
            System.out.println("Customer not found");
        }
    }

    private void updateCustomerContactNumber(){
        System.out.println("Enter the customer Id : ");
        int id = sc.nextInt();
        if (checkCustomerId(id)){
            System.out.println("Enter the new contact number :");
            long contactNo = sc.nextLong();
            if (contactNo != 0){
                System.out.println(updateContactNoByCustomerId(id,contactNo));
            }
        }else {
            System.out.println("Customer not found");
        }
    }

    private void updateCustomerAddress(){
        System.out.println("Enter the customer Id : ");
        int id = sc.nextInt();
        if (checkCustomerId(id)){
            System.out.println("Enter the new address : ");
            String address = sc.next();
            if (address != null){
                System.out.println(updateCustomerAddressByCustomerId(id,address.toLowerCase()));
            }
        }else {
            System.out.println("Customer not found");
        }
    }

    private void updateCustomerEmail(){
        System.out.println("Enter the customer Id : ");
        int id = sc.nextInt();
        if (checkCustomerId(id)){
            System.out.println("Enter the new Email : ");
            String email = sc.next();
            if (email != null){
                System.out.println(updateCustomerEmailByCustomerId(id,email.toLowerCase()));
            }
        }else {
            System.out.println("Customer not found");
        }
    }

    private void updateCustomerGender(){
        System.out.println("Enter the customer Id :");
        int id = sc.nextInt();
        if (checkCustomerId(id)){
            System.out.println("Enter the customers updated gender from the values below : ");
            for(Gender gender : Gender.values()){
                System.out.print(gender + ", ");
            }
            System.out.println();
            //System.out.println("[MALE, FEMALE, TRANSGENDER, OTHERS]");
            Gender gender = Gender.valueOf(sc.next().toUpperCase());
            System.out.println(updateCustomerGenderByCustomerId(id,gender));
        }else {
            System.out.println("Customer not found");
        }
    }

    private void fetchProductName(){
        System.out.println("Enter the product ID : ");
        System.out.println(getProductNameByProductID(sc.nextInt()));
    }

    private void fetchProductPrice(){
        System.out.println("Enter the product ID : ");
        System.out.println(getProductPriceByProductId(sc.nextInt()));
    }

    private void fetchProductQuantity(){
        System.out.println("Enter the product ID : ");
        System.out.println(getProductQuantityByProductId(sc.nextInt()));
    }

    private void fetchProductManufacturingDate(){
        System.out.println("Enter the Product name : ");
        System.out.println(getProductMfgDateByProductName(sc.next()));
    }

    private String getProductNameByProductID(int id){
        if (checkProductId(id)){
            for(ProductDTO product : products){
                if (product.getProductId() == id){
                    return product.getProductName();
                }
            }
        }
        return "ID not found";
    }

    private double getProductPriceByProductId(int id){
        if (checkProductId(id)){
            for(ProductDTO product : products){
                if (product.getProductId() == id){
                    return product.getPrice();
                }
            }
        }
        System.out.println("Not found");
        return 0;
    }

    private int getProductQuantityByProductId(int id){
        if(checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    return product.getQuantity();
                }
            }
        }
        System.out.println("Not found");
        return 0;
    }

    private LocalDate getProductMfgDateByProductName(String name){
        for (ProductDTO product : products){
            if (product.getProductName().equals(name.toLowerCase())){
                return product.getManufactureDate();
            }
        }
        System.out.println("Not found");
        return null;
    }

    private void fetchProductType(){
        System.out.println("Enter the product Id : ");
        System.out.println(getProductTypeByProductId(sc.nextInt()));
    }

    private ProductType getProductTypeByProductId(int id){
        if (checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    return product.getType();
                }
            }
        }
        System.out.println("Not found");
        return null;
    }

    private void fetchProductCategoryByProductId(){
        System.out.println("Enter the product Id : ");
        int id = sc.nextInt();
        if (checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    if (product.getType().equals(ProductType.GROCERY)){
                        System.out.println(product.getGroceryCategory());
                    }else if (product.getType().equals(ProductType.ELECTRONICS)){
                        System.out.println(product.getElectronicsCategory());
                    } else if (product.getType().equals(ProductType.FASHION)){
                        System.out.println(product.getFashionCategory());
                    }else if (product.getType().equals(ProductType.APPLIANCES)) {
                        System.out.println(product.getAppliancesCategory());
                    }else if (product.getType().equals(ProductType.TOYS)) {
                        System.out.println(product.getToysCategory());
                    }else {
                        System.out.println(product.getFurnitureCategory());
                    }
                }
            }
        }else {
            System.out.println("Not found");
        }
    }

    private void fetchProductBrandByProductId(){
        System.out.println("Enter the product Id : ");
        int id = sc.nextInt();
        if (checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    if (product.getType().equals(ProductType.GROCERY)){
                        System.out.println(product.getGroceryBrand());
                    }else if (product.getType().equals(ProductType.ELECTRONICS)){
                        System.out.println(product.getElectronicsBrand());
                    } else if (product.getType().equals(ProductType.FASHION)) {
                        System.out.println(product.getFashionBrand());
                    }else if (product.getType().equals(ProductType.APPLIANCES)) {
                        System.out.println(product.getAppliancesBrand());
                    }else if (product.getType().equals(ProductType.TOYS)) {
                        System.out.println(product.getToysBrand());
                    }else {
                        System.out.println(product.getFurnitureBrand());
                    }
                }
            }
        }else {
            System.out.println("Not found");
        }
    }

    private String updateProductNameByProductId(int productId,String newName){
        for (ProductDTO product : products){
            if (product.getProductId() == productId){
                product.setProductName(newName);
                return "Product Name updated to : " + newName + " for Product Id : " + product.getProductId();
            }
        }
        return  "Product not found";
    }

    private void updateProductName(){
        System.out.println("Enter the product Id : ");
        int id = sc.nextInt();
        if (checkProductId(id)){
            System.out.println("Enter the product new name : ");
            String name = sc.next();
            if (name != null){
                System.out.println(updateProductNameByProductId(id,name.toLowerCase()));
            }
        }else {
            System.out.println("Product not found");
        }
    }

    private String updateProductPriceByProductId(int productId,double price){
        for (ProductDTO product : products){
            if (product.getProductId() == productId){
                product.setPrice(price);
                return "Product Price updated to : " + price + " for Product Id : " + product.getProductId();
            }
        }
        return  "Product not found";
    }

    private void updateProductPrice(){
        System.out.println("Enter the product Id : ");
        int id = sc.nextInt();
        if (checkProductId(id)){
            System.out.println("Enter the product price : ");
            double price = sc.nextDouble();
            if (price > 0){
                System.out.println(updateProductPriceByProductId(id,price));
            }
        }else {
            System.out.println("Product not found");
        }
    }

    private String updateProductQuantityByProductId(int productId,int quantity){
        for (ProductDTO product : products){
            if (product.getProductId() == productId){
                product.setQuantity(quantity);
                return "Product quantity updated to : " + quantity + " for Product Id : " + product.getProductId();
            }
        }
        return  "Product not found";
    }

    private void updateProductQuantity(){
        System.out.println("Enter the product Id : ");
        int id = sc.nextInt();
        if (checkProductId(id)){
            System.out.println("Enter the product quantity : ");
            int quantity = sc.nextInt();
            if (quantity > 0){
                System.out.println(updateProductQuantityByProductId(id,quantity));
            }
        }else {
            System.out.println("Product not found");
        }
    }

    private String updateProductTypeByProductId(int productId,ProductType type){
        for (ProductDTO product : products){
            if (product.getProductId() == productId){
                product.setType(type);
                return "Product Type changed to : " + type + " for Product Id : " + product.getProductId();
            }
        }
        return "Product not found";
    }

    private void updateProductType(){
        System.out.println("Enter the product Id :");
        int id = sc.nextInt();
        if (checkProductId(id)){
            System.out.println("Enter the product type from the values below : ");
            for(ProductType productType : ProductType.values()){
                System.out.print(productType + ", ");
            }
            System.out.println();
            //System.out.println("[GROCERY, ELECTRONICS, FASHION, APPLIANCES, TOYS, FURNITURE]");
            ProductType productType = ProductType.valueOf(sc.next().toUpperCase());
            System.out.println(updateProductTypeByProductId(id,productType));
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    System.out.println("Enter the product category from the values below : ");
                    if (productType.equals(ProductType.GROCERY)){
                        for(GroceryCategory groceryCategory : GroceryCategory.values()){
                            System.out.print(groceryCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[STAPLES, SNACKS, BEVERAGES, DIARY, PACKAGEDFOOD, HOUSEHOLDCARE]");
                        GroceryCategory groceryCategory = GroceryCategory.valueOf(sc.next().toUpperCase());
                        product.setGroceryCategory(groceryCategory);
                        System.out.println("Product Category changed to : " + groceryCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(GroceryBrand groceryBrand : GroceryBrand.values()){
                            System.out.print(groceryBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[AASHIRWAAD, NANDINI, TATA, BINGO, LAYS, PARLE, SUNFEAST, MAGGI]");
                        GroceryBrand groceryBrand = GroceryBrand.valueOf(sc.next().toUpperCase());
                        product.setGroceryBrand(groceryBrand);
                        System.out.println("Product Brand changed to : " + groceryBrand + " for Product Id : " + product.getProductId());
                    }else if (productType.equals(ProductType.ELECTRONICS)){
                        for(ElectronicsCategory electronicsCategory : ElectronicsCategory.values()){
                            System.out.print(electronicsCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[MOBILES, LAPTOPS, SPEAKERS, CAMERAS, DESKTOPS;]");
                        ElectronicsCategory electronicsCategory = ElectronicsCategory.valueOf(sc.next().toUpperCase());
                        product.setElectronicsCategory(electronicsCategory);
                        System.out.println("Product Category changed to : " + electronicsCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(ElectronicsBrand electronicsBrand : ElectronicsBrand.values()){
                            System.out.print(electronicsBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[MI, VIVO, REALME, APPLE, SAMSUNG, OPPO, ASUS]");
                        ElectronicsBrand electronicsBrand = ElectronicsBrand.valueOf(sc.next().toUpperCase());
                        product.setElectronicsBrand(electronicsBrand);
                        System.out.println("Product Brand changed to : " + electronicsBrand + " for Product Id : " + product.getProductId());
                    } else if (productType.equals(ProductType.FASHION)) {
                        for(FashionCategory fashionCategory : FashionCategory.values()){
                            System.out.print(fashionCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[TOPWEAR, BOTTOMWEAR, FOOTWEAR, ESSENTIALS, ACCESSORIES, WATCHES]");
                        FashionCategory fashionCategory = FashionCategory.valueOf(sc.next().toUpperCase());
                        product.setFashionCategory(fashionCategory);
                        System.out.println("Product Category changed to : " + fashionCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(FashionBrand fashionBrand : FashionBrand.values()){
                            System.out.print(fashionBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[NIKE, ADIDAS, PUMA, REEBOK, FOSSIL, TITAN, CASIO;]");
                        FashionBrand fashionBrand = FashionBrand.valueOf(sc.next().toUpperCase());
                        product.setFashionBrand(fashionBrand);
                        System.out.println("Product Brand changed to : " + fashionBrand + " for Product Id : " + product.getProductId());
                    }else if (productType.equals(ProductType.APPLIANCES)) {
                        for(AppliancesCategory appliancesCategory : AppliancesCategory.values()){
                            System.out.print(appliancesCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[TV, AC, REFRIGERATOR, WASHINGMACHINE, GRINDER, MIXER, OVEN]");
                        AppliancesCategory appliancesCategory = AppliancesCategory.valueOf(sc.next().toUpperCase());
                        product.setAppliancesCategory(appliancesCategory);
                        System.out.println("Product Category changed to : " + appliancesCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(AppliancesBrand appliancesBrand : AppliancesBrand.values()){
                            System.out.print(appliancesBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[SAMSUNG, LG, GODREJ, WHIRLPOOL, PHILIPS, IFB]");
                        AppliancesBrand appliancesBrand = AppliancesBrand.valueOf(sc.next().toUpperCase());
                        product.setAppliancesBrand(appliancesBrand);
                        System.out.println("Product Brand changed to : " + appliancesBrand + " for Product Id : " + product.getProductId());
                    }else if (productType.equals(ProductType.TOYS)) {
                        for(ToysCategory toysCategory : ToysCategory.values()){
                            System.out.print(toysCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[BOARDGAMES, PUZZLES, REMOTECONTROL, ACTIONGAMES, CARDGAMES, GUNS, DOLLS]");
                        ToysCategory toysCategory = ToysCategory.valueOf(sc.next().toUpperCase());
                        product.setToysCategory(toysCategory);
                        System.out.println("Product Category changed to : " + toysCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(ToysBrand toysBrand : ToysBrand.values()){
                            System.out.print(toysBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[LEGO, NERF, DISNEY, HOTWHEELS, BARBIE]");
                        ToysBrand toysBrand = ToysBrand.valueOf(sc.next().toUpperCase());
                        product.setToysBrand(toysBrand);
                        System.out.println("Product Brand changed to : " + toysBrand + " for Product Id : " + product.getProductId());
                    }else {
                        for(FurnitureCategory furnitureCategory : FurnitureCategory.values()){
                            System.out.print(furnitureCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[BEDS, SOFAS, DININGTABLE, SHOERACKS]");
                        FurnitureCategory furnitureCategory = FurnitureCategory.valueOf(sc.next().toUpperCase());
                        product.setFurnitureCategory(furnitureCategory);
                        System.out.println("Product Category changed to : " + furnitureCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(FurnitureBrand furnitureBrand : FurnitureBrand.values()){
                            System.out.print(furnitureBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[ROYALOAK, GODREJ, PEPS, CENTUARY, SLEEPWELL]");
                        FurnitureBrand furnitureBrand = FurnitureBrand.valueOf(sc.next().toUpperCase());
                        product.setFurnitureBrand(furnitureBrand);
                        System.out.println("Product Brand changed to : " + furnitureBrand + " for Product Id : " + product.getProductId());
                    }
                }
            }
        }else {
            System.out.println("Product not found");
        }
    }

    private void updateProductCategory(){
        System.out.println("Enter the product Id :");
        int id = sc.nextInt();
        if (checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    System.out.println("Enter the product brand from the values below : ");
                    if (product.getType().equals(ProductType.GROCERY)){
                        for(GroceryCategory groceryCategory : GroceryCategory.values()){
                            System.out.print(groceryCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[STAPLES, SNACKS, BEVERAGES, DIARY, PACKAGEDFOOD, HOUSEHOLDCARE]");
                        GroceryCategory groceryCategory = GroceryCategory.valueOf(sc.next().toUpperCase());
                        product.setGroceryCategory(groceryCategory);
                        System.out.println("Product Category changed to : " + groceryCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(GroceryBrand groceryBrand : GroceryBrand.values()){
                            System.out.print(groceryBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[AASHIRWAAD, NANDINI, TATA, BINGO, LAYS, PARLE, SUNFEAST, MAGGI]");
                        GroceryBrand groceryBrand = GroceryBrand.valueOf(sc.next().toUpperCase());
                        product.setGroceryBrand(groceryBrand);
                        System.out.println("Product Brand changed to : " + groceryBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.ELECTRONICS)){
                        for(ElectronicsCategory electronicsCategory : ElectronicsCategory.values()){
                            System.out.print(electronicsCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[MOBILES, LAPTOPS, SPEAKERS, CAMERAS, DESKTOPS;]");
                        ElectronicsCategory electronicsCategory = ElectronicsCategory.valueOf(sc.next().toUpperCase());
                        product.setElectronicsCategory(electronicsCategory);
                        System.out.println("Product Category changed to : " + electronicsCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(ElectronicsBrand electronicsBrand : ElectronicsBrand.values()){
                            System.out.print(electronicsBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[MI, VIVO, REALME, APPLE, SAMSUNG, OPPO, ASUS]");
                        ElectronicsBrand electronicsBrand = ElectronicsBrand.valueOf(sc.next().toUpperCase());
                        product.setElectronicsBrand(electronicsBrand);
                        System.out.println("Product Brand changed to : " + electronicsBrand + " for Product Id : " + product.getProductId());
                    } else if (product.getType().equals(ProductType.FASHION)) {
                        for(FashionCategory fashionCategory : FashionCategory.values()){
                            System.out.print(fashionCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[TOPWEAR, BOTTOMWEAR, FOOTWEAR, ESSENTIALS, ACCESSORIES, WATCHES]");
                        FashionCategory fashionCategory = FashionCategory.valueOf(sc.next().toUpperCase());
                        product.setFashionCategory(fashionCategory);
                        System.out.println("Product Category changed to : " + fashionCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(FashionBrand fashionBrand : FashionBrand.values()){
                            System.out.print(fashionBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[NIKE, ADIDAS, PUMA, REEBOK, FOSSIL, TITAN, CASIO;]");
                        FashionBrand fashionBrand = FashionBrand.valueOf(sc.next().toUpperCase());
                        product.setFashionBrand(fashionBrand);
                        System.out.println("Product Brand changed to : " + fashionBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.APPLIANCES)) {
                        for(AppliancesCategory appliancesCategory : AppliancesCategory.values()){
                            System.out.print(appliancesCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[TV, AC, REFRIGERATOR, WASHINGMACHINE, GRINDER, MIXER, OVEN]");
                        AppliancesCategory appliancesCategory = AppliancesCategory.valueOf(sc.next().toUpperCase());
                        product.setAppliancesCategory(appliancesCategory);
                        System.out.println("Product Category changed to : " + appliancesCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(AppliancesBrand appliancesBrand : AppliancesBrand.values()){
                            System.out.print(appliancesBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[SAMSUNG, LG, GODREJ, WHIRLPOOL, PHILIPS, IFB]");
                        AppliancesBrand appliancesBrand = AppliancesBrand.valueOf(sc.next().toUpperCase());
                        product.setAppliancesBrand(appliancesBrand);
                        System.out.println("Product Brand changed to : " + appliancesBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.TOYS)) {
                        for(ToysCategory toysCategory : ToysCategory.values()){
                            System.out.print(toysCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[BOARDGAMES, PUZZLES, REMOTECONTROL, ACTIONGAMES, CARDGAMES, GUNS, DOLLS]");
                        ToysCategory toysCategory = ToysCategory.valueOf(sc.next().toUpperCase());
                        product.setToysCategory(toysCategory);
                        System.out.println("Product Category changed to : " + toysCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(ToysBrand toysBrand : ToysBrand.values()){
                            System.out.print(toysBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[LEGO, NERF, DISNEY, HOTWHEELS, BARBIE]");
                        ToysBrand toysBrand = ToysBrand.valueOf(sc.next().toUpperCase());
                        product.setToysBrand(toysBrand);
                        System.out.println("Product Brand changed to : " + toysBrand + " for Product Id : " + product.getProductId());
                    }else {
                        for(FurnitureCategory furnitureCategory : FurnitureCategory.values()){
                            System.out.print(furnitureCategory + ", ");
                        }
                        System.out.println();
                        //System.out.println("[BEDS, SOFAS, DININGTABLE, SHOERACKS]");
                        FurnitureCategory furnitureCategory = FurnitureCategory.valueOf(sc.next().toUpperCase());
                        product.setFurnitureCategory(furnitureCategory);
                        System.out.println("Product Category changed to : " + furnitureCategory + " for Product Id : " + product.getProductId());
                        System.out.println("Enter the product brand from the values below : ");
                        for(FurnitureBrand furnitureBrand : FurnitureBrand.values()){
                            System.out.print(furnitureBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[ROYALOAK, GODREJ, PEPS, CENTUARY, SLEEPWELL]");
                        FurnitureBrand furnitureBrand = FurnitureBrand.valueOf(sc.next().toUpperCase());
                        product.setFurnitureBrand(furnitureBrand);
                        System.out.println("Product Brand changed to : " + furnitureBrand + " for Product Id : " + product.getProductId());
                    }
                }
            }
        }else {
            System.out.println("Product not found");
        }
    }

    private void updateProductBrand(){
        System.out.println("Enter the product Id :");
        int id = sc.nextInt();
        if (checkProductId(id)){
            for (ProductDTO product : products){
                if (product.getProductId() == id){
                    System.out.println("Enter the product brand from the values below : ");
                    if (product.getType().equals(ProductType.GROCERY)){
                        for(GroceryBrand groceryBrand : GroceryBrand.values()){
                            System.out.print(groceryBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[AASHIRWAAD, NANDINI, TATA, BINGO, LAYS, PARLE, SUNFEAST, MAGGI]");
                        GroceryBrand groceryBrand = GroceryBrand.valueOf(sc.next().toUpperCase());
                        product.setGroceryBrand(groceryBrand);
                        System.out.println("Product Brand changed to : " + groceryBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.ELECTRONICS)){
                        for(ElectronicsBrand electronicsBrand : ElectronicsBrand.values()){
                            System.out.print(electronicsBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[MI, VIVO, REALME, APPLE, SAMSUNG, OPPO, ASUS]");
                        ElectronicsBrand electronicsBrand = ElectronicsBrand.valueOf(sc.next().toUpperCase());
                        product.setElectronicsBrand(electronicsBrand);
                        System.out.println("Product Brand changed to : " + electronicsBrand + " for Product Id : " + product.getProductId());
                    } else if (product.getType().equals(ProductType.FASHION)) {
                        for(FashionBrand fashionBrand : FashionBrand.values()){
                            System.out.print(fashionBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[NIKE, ADIDAS, PUMA, REEBOK, FOSSIL, TITAN, CASIO;]");
                        FashionBrand fashionBrand = FashionBrand.valueOf(sc.next().toUpperCase());
                        product.setFashionBrand(fashionBrand);
                        System.out.println("Product Brand changed to : " + fashionBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.APPLIANCES)) {
                        for(AppliancesBrand appliancesBrand : AppliancesBrand.values()){
                            System.out.print(appliancesBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[SAMSUNG, LG, GODREJ, WHIRLPOOL, PHILIPS, IFB]");
                        AppliancesBrand appliancesBrand = AppliancesBrand.valueOf(sc.next().toUpperCase());
                        product.setAppliancesBrand(appliancesBrand);
                        System.out.println("Product Brand changed to : " + appliancesBrand + " for Product Id : " + product.getProductId());
                    }else if (product.getType().equals(ProductType.TOYS)) {
                        for(ToysBrand toysBrand : ToysBrand.values()){
                            System.out.print(toysBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[LEGO, NERF, DISNEY, HOTWHEELS, BARBIE]");
                        ToysBrand toysBrand = ToysBrand.valueOf(sc.next().toUpperCase());
                        product.setToysBrand(toysBrand);
                        System.out.println("Product Brand changed to : " + toysBrand + " for Product Id : " + product.getProductId());
                    }else {
                        for(FurnitureBrand furnitureBrand : FurnitureBrand.values()){
                            System.out.print(furnitureBrand + ", ");
                        }
                        System.out.println();
                        //System.out.println("[ROYALOAK, GODREJ, PEPS, CENTUARY, SLEEPWELL]");
                        FurnitureBrand furnitureBrand = FurnitureBrand.valueOf(sc.next().toUpperCase());
                        product.setFurnitureBrand(furnitureBrand);
                        System.out.println("Product Brand changed to : " + furnitureBrand + " for Product Id : " + product.getProductId());
                    }
                }
            }
        }else {
            System.out.println("Product not found");
        }
    }

}
