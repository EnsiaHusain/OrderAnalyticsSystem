import com.order.system.SampleData;
import com.order.system.model.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Hello and welcome!");


    List<Order> orders = SampleData.getSampleData();
    System.out.println(">>>>>>>>>>>>>>>>>>>>Total Revenue<<<<<<<<<<<<<<<<<<<<<<");
    Double result = orders.stream().mapToDouble(o-> o.getPrice()*o.getQuantity()).
            sum();
    System.out.println(result);

    System.out.println(">>>>>>>>>>>>>>>>>>>>Top 3 Customers<<<<<<<<<<<<<<<<<<<<<<");
    Map<String, Double> topCustomers =  orders.stream().collect(Collectors.groupingBy(Order::getCustomerName,
            Collectors.summingDouble(o-> o.getPrice()*o.getQuantity())));
    topCustomers.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed()).
            limit(3).forEach(System.out::println);


    System.out.println(">>>>>>>>>>>>>>>>>>>>Most Sold Product<<<<<<<<<<<<<<<<<<<<<<");
    Map<String, Integer> mostSoldProductList = orders.stream().collect(Collectors.groupingBy(Order::getProduct,
            Collectors.summingInt(Order::getQuantity)));
    Optional<Map.Entry<String,Integer>> mostSoldProduct = mostSoldProductList.entrySet().stream().
            max(Map.Entry.<String,Integer>comparingByValue());

    if (mostSoldProduct.isEmpty()) {
        return;
    }
    System.out.println(mostSoldProduct.get().getKey());
    System.out.println("Quantity Sold = "+mostSoldProduct.get().getValue());

    System.out.println(">>>>>>>>>>>>>>>>>>>>Order By City<<<<<<<<<<<<<<<<<<<<<<");
    Map<String,List<Order>> ordersByCity = orders.stream().collect(Collectors.groupingBy(Order::getCity));
    ordersByCity.forEach((key, value) -> System.out.println(key + "-" + value));

    System.out.println(">>>>>>>>>>>>>>>>>>>>Average order value<<<<<<<<<<<<<<<<<<<<<<");
    Double avgOrderValue = orders.stream().mapToDouble(o-> o.getQuantity()*o.getPrice()).average().orElse(0.0);
    System.out.println(avgOrderValue);

    System.out.println(">>>>>>>>>>>>>>>>>>>>products sold more than 5 times<<<<<<<<<<<<<<<<<<<<<<");
    List<Order> productsSoldTheMost = orders.stream().filter(o-> o.getQuantity()>5).toList();
    productsSoldTheMost.forEach(o-> System.out.println(o.getProduct()+"-"+o.getCategory()));

    System.out.println(">>>>>>>>>>>>>>>>>>>>distinct categories<<<<<<<<<<<<<<<<<<<<<<");
    Set<String> distinctCategories = orders.stream().map(Order::getCategory).collect(Collectors.toSet());
    distinctCategories.forEach(System.out::println);

    System.out.println(">>>>>>>>>>>>>>>>>>>>grouping and partitioning<<<<<<<<<<<<<<<<<<<<<<");

}
