import org.testng.annotations.Test;

public class Feature1Test {

    @Test(groups = {"p1", "api"})
    public void test_p1api(){
        System.out.println("I am feature 1. groups: p1 api");
    }

    @Test(groups = {"p1", "cart"})
    public void test_p1cart(){
        System.out.println("I am feature 1. groups: p1 cart");
    }

    @Test(groups = {"p1", "account"})
    public void test_p1account(){
        System.out.println("I am feature 1. groups: p1 account");
    }

    @Test(groups = {"p2", "api"})
    public void test_p2api(){
        System.out.println("I am feature 1. groups: p2 api");
    }

    @Test(groups = {"p2", "cart"})
    public void test_p2cart(){
        System.out.println("I am feature 1. groups: p2 cart");
    }

    @Test(groups = {"p2", "account"})
    public void test_p2account(){
        System.out.println("I am feature 1. groups: p2 account");
    }



}
