import java.util.ArrayList;
import java.util.List;

public class Fish {

    public static void main(String[] args){

	float FishesLength[] = {10.0f, 15.5f, 18.0f, 29.5f, 45.5f};

	ArrayList<Float> alf = new ArrayList<Float>();

	for(Float f:FishesLength){
	    alf.add(f);
	    if ( f > 28 ) {
		System.out.println(f);
	    }
	}
	
    }
}
