public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        System.out.println(nyStore.orderPizza("queijo") + "\n");

        Pizza pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
        pizza.setName("Pizza de Queijo no Estilo de Chicago");
        pizza.prepare();
        System.out.println(pizza);
    }
}
