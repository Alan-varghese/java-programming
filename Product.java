public class Product {
int pcode;
String name;
double price;

void data(int c, String n, double p) {
pcode = c;
name = n;
price = p;
}
void display(){
System.out.println(pcode + "\t\t" + name + "\t\t" + price);
}

static void findLowest(Product product1, Product product2, Product product3) {
if (product1.price <= product2.price && product1.price <= product3.price) {
System.out.println("\nProduct 1 is of the lowest price!");
} else if (product2.price <= product1.price && product2.price <= product3.price) {
System.out.println("\nProduct 2 is of the lowest price!");
} else {
System.out.println("\nProduct 3 is of the lowest price!");
}
}

public static void main(String[] args) {
        Product obj1 = new Product();
        Product obj2 = new Product();
        Product obj3 = new Product();
        obj1.data(101, "Product_1", 100.0);
        obj2.data(102, "Product_2", 128.40);
        obj3.data(103, "Product_3", 790.00);
        System.out.println("Product information:\nProduct_Code\tProduct_Name\tProduct_Price");
        obj1.display();
        obj2.display();
        obj3.display();
        findLowest(obj1, obj2, obj3);
    }
}
