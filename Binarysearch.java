class Binarysearch
{
    public static void bsearch(int array[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first<last)
        {
            if(array[mid]<key)
            {
                first=mid+1;
            }
            else if(array[mid]==key)
            {
                System.out.println("element is found at index:"+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println("elements is not found");
        }
    }
        public static void main(String args[])
        {
            int array[]={1,2,3,4};
            int first=0;
            int last=array.length-1;
            int key=3;
            bsearch(array,first,last,key);
        }

    
}