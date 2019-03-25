package patB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author: hui
 * @Date: 2019/3/15 16:17
 * 两个光读入就超时，一个节点错误.. 思路是对的，我看最后out的循环和csdn C++过的也一样啊...
 */
public class PatB1020 {
    public static void main(String[] args) {
        class Node {
            int count;
            double price;
            int sum;
            public Node(int count,double price,int sum){
                this.count=count;this.sum=sum;this.price=price;
            }

            void setPrice(){
                price=1.0*sum/count;
            }
        }
        int sumAccount=0;
        int sumprice=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d=scanner.nextInt();

        if(n!=0)
            scanner.nextLine();
        Node[] node=new Node[n];
        for (int i=0;i<n;i++)
            node[i]=new Node(0,0,0);

        for (int i=0;i<n;i++) {
            node[i].count = scanner.nextInt();
            sumAccount+=node[i].count;
        }
        scanner.nextLine();
        for (int i=0;i<n;i++) {
            node[i].sum = scanner.nextInt();
            sumprice+=node[i].sum;
        }
        scanner.close();
        if(d>=sumAccount)
        {
            System.out.printf("%.2f",(double)sumprice);
            return;
        }
        for (int i=0;i<n;i++) {
            node[i].setPrice();
        }

        Arrays.sort(node, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.price<o2.price)
                    return 1;
                else
                    return -1;
            }
        });

        double out=0;
        for (int i=0;i<n;i++){
            if (node[i].count<=d)
            {
                d-=node[i].count;
                out+=node[i].sum;
            }
            else
            {
                out+=node[i].price*d;
                break;
            }
        }

        System.out.printf("%.2f",out);

    }
}
