package Stack;

public class CustomDynamicStack extends CustomStack {
    public CustomDynamicStack(){
        super();
    }

    public CustomDynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int num) {
       if(this.isFull()){
           // doulble the array size
           int i;
           int [] temp = new int[this.data.length*2];
           for( i=0;i<temp.length;i++){
               this.data[i] = temp[i];
           }
           this.data = temp;
       }
        // insert item
        super.push(num);
       return true;
    }
}
