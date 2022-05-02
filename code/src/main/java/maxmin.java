public class maxmin {
    private float [] arr;
    public int size=0;


    public float [] max_min(){
        float max,min;
        float [] max_min_arr=new float[2];

        if (size==0)
            return max_min_arr;

        max=arr[0];
        min=arr[0];
        for (int i = 1; i < size; i++) {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }

        max_min_arr=new float[]{max,min};
        return max_min_arr;

    }
    public void inittest_numbers(float [] numbers,int size){
        arr=numbers;
        this.size=size;
    }

}
