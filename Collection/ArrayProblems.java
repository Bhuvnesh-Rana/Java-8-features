package Collection;


class problems{

    public static int sumOfElementsInArray(){
        int array[]={1,2,3,4};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public static int maximumElementInArray(){
        int array[]={1,2,5,4,7,3};
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static void findElementInArray(){
        int array[]={3,7,2,8,5,7,4};
        int e=2;
        int result =-1;
        for(int i=0;i<array.length;i++){
            if(e==array[i]){
                result=i;
                break;
            }
        }
        if(result==-1)
            System.out.println("Not found");
        else
            System.out.println("Found element e "+e+" at index "+result);
    }

    public static void noOfOccurenceOfElement(){
        int array[]={1,5,3,7,3,4,9,3};
        int e=3;
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==e)
            count++;
        }
        System.out.println("Element "+e+" occured: "+count+" times");
    }
}



public class ArrayProblems {
    
    public static void main(String[] args) {
    //    int a = problems.sumOfElementsInArray();
    // int a= problems.maximumElementInArray();
    //  problems.findElementInArray();
    problems.noOfOccurenceOfElement();
    //    System.out.println(a);
    }
}
