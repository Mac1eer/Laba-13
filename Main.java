public class Main {
    public static void main(String[] args) {
        Technic technic = new Technic("Пылесос",12000,7);
        Fruits fruits = new Fruits("Виноград",90,10);
        Vegetables vegetables = new Vegetables("Огурцы",200,10);
        User1 Nata = new User1("Крылова Наталья", "KrNataly", "KreN12456");
        User2 Kiril = new User2("Рыбов Кирилл", "Kiril123", "Kiril123");
        User3 Pasha = new User3("Попов Павел", "PashaGod", "Popov123");
        Base base = new Base();
        base.Product(technic, Nata);
        base.Product(fruits, Kiril);
        base.Product(vegetables, Pasha);
    }
}
interface Product {
    void NameProduct(String name);
    void Price();
    void Rating();
}
class Technic implements Product {
    public String nameProduct;
    public double price;
    public int rating;
    public Technic (String nameProduct, double price, int rating){
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void NameProduct(String name){
        this.nameProduct = name;
    }
    @Override
    public void Price(){
        System.out.println(this.price);
    }
    @Override
    public void Rating(){
        System.out.println(this.rating);
    }
}
class Fruits implements Product {
    public String nameProduct;
    public double price;
    public int rating;
    public Fruits (String nameProduct, double price, int rating){
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void NameProduct(String name){
        this.nameProduct = name;
    }
    @Override
    public void Price(){
        System.out.println(this.price);
    }
    @Override
    public void Rating(){
        System.out.println(this.rating);
    }
}

class Vegetables implements Product {
    public String nameProduct;
    public double price;
    public int rating;
    public Vegetables (String nameProduct, double price, int rating){
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void NameProduct(String name){
        this.nameProduct = name;
    }
    @Override
    public void Price(){
        System.out.println(this.price);
    }
    @Override
    public void Rating(){
        System.out.println(this.rating);
    }
}
interface User {
    void Login(String Login);
    void Password(String Password);
}
class User1 implements User {
    public String name;
    public String Login;
    public String Password;
    public User1 (String name, String Login, String Password){
        this.name = name;
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login(String Login){
        this.Login = Login;
    }
    @Override
    public void Password(String Password){
        this.Password = Password;
    }
}

class User2 implements User {
    public String name;
    public String Login;
    public String Password;
    public User2 (String name, String Login, String Password){
        this.name = name;
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login(String Login){
        this.Login = Login;
    }
    @Override
    public void Password(String Password){
        this.Password = Password;
    }
}
class User3 implements User {
    public String name;
    public String Login;
    public String Password;
    public User3 (String name, String Login, String Password){
        this.name = name;
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login(String Login){
        this.Login = Login;
    }
    @Override
    public void Password(String Password){
        this.Password = Password;
    }
}
class Base implements Product, User {
    public String nameProduct;
    public String login;
    @Override
    public void NameProduct(String name){
        this.nameProduct = name;
    }
    @Override
    public void Price() {
    }
    @Override
    public void Rating() {
    }
    @Override
    public void Login(String Login) {
        this.login = Login;
    }
    @Override
    public void Password(String password) {
    }
    public void Product(Technic product, User1 user) {
        System.out.println(user.name +" купил(a) "+ product.nameProduct);
    }
    public void Product(Fruits product, User2 user) {
        System.out.println(user.name +" купил(a) "+ product.nameProduct);
    }
    public void Product(Vegetables product, User3 user) {
        System.out.println(user.name +" купил(a) "+ product.nameProduct);
    }
}
