import java.util.ArrayList;

class EvenOrOdd{
  
    public void EvenNumber(ArrayList<Long> numbers){
        for(int i=numbers.size()-1;i>=0;i--){
            if(numbers.get(i)%2!=0){
                numbers.remove(i);
            }
        }
    }
    public void OddNumber(ArrayList<Long> numbers){
        for(int i=numbers.size()-1;i>=0;i--){
            if(numbers.get(i)%2==0){
                numbers.remove(i);
            }
        }
    }
}