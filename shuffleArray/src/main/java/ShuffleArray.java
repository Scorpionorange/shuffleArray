/**
 * Created by ScorpionOrange on 2016/10/17.
 * 数组的每一位均与随机的另一位交换；
 */
public class ShuffleArray {
    public void Fiseher_Yates_Shuffle(String[] input){

        String temp = "";
        for(int i = 0; i < input.length; i++){
            int j = (int)(Math.random() * input.length);
            temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}
