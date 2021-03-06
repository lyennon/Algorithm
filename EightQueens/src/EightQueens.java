import java.util.Map;

/**
 * Created by Lo_oY on 2016/9/6.
 */
public class EightQueens {

    private int length=0;
    private int[] arr=new int[9];


    /**
     * 判断放置的位置是否正确
     * @param num
     * @return
     */
    private boolean place(int num){

//        System.out.println(num);
        for(int i = 1;i < num; i++){
            if(arr[i] == arr[num] || Math.abs(arr[num]-arr[i]) == Math.abs(num - i))
                return false;
        }
        return true;
    }

    /**
     * 递归求解，如果满足条件，输出结果并计数
     * @param num
     */

    private void queen(int num) {
        for (int i = 1; i < 9; i++) {
            arr[num] = i;
            if (place(num)) {
                if (num == 8) {
                    length++;
                    display();
                } else {
                    queen(num + 1);
                }
            }
        }
    }

    /**
     * 展示结果
     */
    public void  display(){
      for(int i = 1;i < 9;i++)
          System.out.print(arr[i]+" ");
        System.out.println("");
    }

    public static void main(String args[]){

        EightQueens queens = new EightQueens();
        queens.queen(1);
        System.out.println(queens.length);
    }
}
