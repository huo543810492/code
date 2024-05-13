package Interview.practiceBeforeInterview;

public class BitManipulation {
    int[] num;

    public BitManipulation(){
        num=new int[1000000/32+1];
    }

    public int getIndex(int key){
        return key/32;
    }

    public int getMask(int key){
        return 1<<(key%32);
    }

    public void add(int key){
        num[getIndex(key)] |= getMask(key);
    }

    public void remove(int key){
        num[getIndex(key)] &= (~getMask(key));
    }

    public boolean contains(int key){
        return (num[getIndex(key)] & getMask(key)) != 0;
    }
}
