package com.company;
import java.util.*;
public class mangmentGoods {
    static ArrayList<goods> arrayList =new ArrayList();
    static int id;
    static String name;
    static double price;
    static int count;
    Scanner sc = new Scanner(System.in);

    void list_of_goods(){
        System.out.println("------------List of goods-----------------");
        System.out.println("id\tName\tUnit Price\tcount");
        //1 System.out.println(good.length);
        if(arrayList.size()!=0){
            for ( goods good:arrayList) {
                System.out.println(good.getId()+"\t\t"+good.getName()+"\t\t"+good.getPrice()+"\t\t"+good.getCount());
            }
        }else{
            System.out.println("The product information is empty!");
        }
    }
    // add product

    void add(){
        System.out.println("-------------Add goods-----------------");
        System.out.println("Please enter the id of the goods you want to add:");
        id=sc.nextInt();
        System.out.println("Please enter the name of the goods you want to add:");
        name=sc.next();
        System.out.println("Please enter the price of the goods you want to add:");
        price=sc.nextDouble();
        System.out.println("Please enter the number of the product:");
        count=sc.nextInt();
        boolean add = arrayList.add(new goods(id, name, price,count));
        System.out.println("Added successfully!");
        System.out.println("ID\tName\tUnit Price\tno of units");
        System.out.print(id+"\t\t"+ name+"\t\t"+ price+"\t\t"+count);
        System.out.println();
    }

    //Delete product
    void remove(){
        System.out.println("-------------Delete goods-----------------");
        System.out.println("Please select the product ID you want to delete:");
        int id2=sc.nextInt();
        int index=0;
        int i=0;
        for (goods g1:arrayList) {
            if(g1.getId()==id2){
                index=i;
                i++;
                arrayList.remove(index);
                System.out.println("successfully deleted!");
            }
            else{
                System.out.println("item not fount");
                break;
        }


        }

    }


    void login(){
        while (true){
            System.out.println("----------------Supermarket Management System!--------------------------");
            System.out.println("1. List of goods");
            System.out.println("2. Increase cargo");
            System.out.println("3. Delete goods");
            System.out.println("4. Exit");
            System.out.println("Please enter the menu of your choice (please choose from 1-4):");
            int menue=sc.nextInt();
            if(menue==1){//View list
                list_of_goods();
            }else if(menue==2){

                add();//Adding goods
            }
            else if(menue==3){
                remove();//Delete product
            }else if(menue==4){
                test.login();//Exit the commodity system
                break;
            }else{
                System.out.println("Select wrong, please select again:");
            }
        }

    }


}
