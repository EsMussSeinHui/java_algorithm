package Fourth.F_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: hui
 * @Date: 2019/3/4 12:41
 *
 * 这边学c++强用数组其实比较麻烦。涉及到了内部类 在这里使用了 局部内部类，匿名静态类
 */
public class PatA1025 {
    public static void main(String[] args) throws IOException {
        class Students {
            String id;
            int score;
            int location_number;
            int local_rank;
            public Students(String id,int score,int location_number){
                this.id=id;
                this.score=score;
                this.location_number=location_number;
                this.local_rank=0;
            }
            public void setLocal_rank(int local_rank){
                this.local_rank=local_rank;
            }
        }
        Students [] stu=new Students[30000];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int num=0,sum=0,rank=0;
        int n=Integer.parseInt(reader.readLine());
        for(int i=0;i<n;i++){
            num=Integer.parseInt(reader.readLine());
            sum+=num;
            for (int j=sum-num;j<sum;j++){
                String [] str=reader.readLine().split(" ");
                stu[j]=new Students(str[0],Integer.parseInt(str[1]),i+1);
            }
            Arrays.sort(stu, sum - num, sum, new Comparator<Students>() {
                @Override
                public int compare(Students o1, Students o2) {
                    if (o1.score < o2.score)
                        return 1;
                    else if (o1.score == o2.score) {
                        if(o1.id.compareTo(o2.id)>0)  //
                                return 1;
                        else
                                return -1;
                    } else
                        return -1;
                }
            });
            stu[sum-num].setLocal_rank(1);
            rank=1;
            for (int j=sum-num+1;j<sum;j++){
                rank++;
                if(stu[j].score==stu[j-1].score) {
                    stu[j].setLocal_rank(stu[j - 1].local_rank);
                    continue;
                }
                stu[j].setLocal_rank(rank);
            }
        }

//        out
        System.out.println(sum);
        Arrays.sort(stu, 0, sum, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.score<o2.score)
                    return 1;
                else if (o1.score == o2.score) {

                    return 0;
                } else
                    return -1;
            }
        });

        rank=1;
        for(int i=0;i<sum;i++){
            if(i>0&&stu[i].score!=stu[i-1].score)
                rank=i+1;
            System.out.println(stu[i].id+" "+rank+" "+stu[i].location_number+" "+stu[i].local_rank);
        }
        return ;
    }
}




