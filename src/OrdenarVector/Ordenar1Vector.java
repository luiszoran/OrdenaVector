package OrdenarVector;

public class Ordenar1Vector {

    public static int ordenar(int[] vector){
        int temp;
        for(int i = 0; i<vector.length;i++){
            int j=i+1;
            while(j < vector.length){
                if(vector[i] < vector[j]){
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                    break;
                }
                j++;
            }
        }
        return 0;
    }

}