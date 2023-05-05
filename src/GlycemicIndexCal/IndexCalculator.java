
package GlycemicIndexCal;
import java.util.Scanner;
/**
 *
 * @author Aysenur
 */
public class IndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter food type:");
        String type=input.next();
        function(type.toLowerCase());
	}
        public static void function(String type2) {
        	 String type=type2;
        	 Scanner input = new Scanner(System.in);
    		switch (type) 
    		{
    			case "grain":
	    			System.out.println("Enter a food (rice,white bread,pasta,bulgur,oat):");
	    			String food=input.next();
	    				switch(food.toLowerCase()) {
		    				case "rice":
		    					System.out.print("Enter the amount of rice:" );
		    					int amount_R = input.nextInt();
		    					Grain Rice=new Grain("Rice",89,amount_R);
			    			    Rice.getGlisemic();
			    			    break;
		    				case "whitebread":
		    					System.out.print("Enter the amount of white bread:" );
		    					int amount_WB = input.nextInt();
		    					Grain whiteBread=new Grain("whiteBread",75,amount_WB);
			    				 whiteBread.getGlisemic();
			    				 break;
		    				case "pasta":
		    					System.out.print("Enter the amount of pasta:" );
		    					int amount_P = input.nextInt();
		    					Grain Pasta=new Grain("Pasta",47,amount_P);
			    				 Pasta.getGlisemic();
			    				 break;
		    				case "bulgur":
		    					System.out.print("Enter the amount of bulgur:" );
		    					int amount_B = input.nextInt();
		    					Grain Bulgur=new Grain("Bulgur",48,amount_B);
			    				 Bulgur.getGlisemic();
			    				 break;
		    				case "oat":
		    					System.out.print("Enter the amount of oat:" );
		    		 			int amount_O = input.nextInt();
		    		 			Grain Oat= new Grain("Oat",55,amount_O);
		    		 			 Oat.getGlisemic();
		    		 			break;
		    				default:
		    					System.out.println("You entered wrong food name.");
	    				}
			    break;	  		 
		    	case "fruit": 	
		    		 System.out.println("Enter the food:");
		    		 food=input.next();
		    		 	switch(food.toLowerCase()) {
		    		 		case "apple":
		    		 			System.out.print("Enter the amount of apple:" );
		    		 			int amount_A = input.nextInt();
		    		 			Fruit Apple= new Fruit("Apple",39,amount_A);
		    		 			Apple.getGlisemic();
		    		 			break;
		    		 		case "orange":
		    		 			System.out.print("Enter the amount of orange:" );
		    		 			int amount_Or = input.nextInt();
		    		 			Fruit Orange= new Fruit("Orange",40,amount_Or);
		    		 			Orange.getGlisemic();
		    		 			break;
		    		 		case "banana":
		    		 			System.out.print("Enter the amount of banana:" );
		    		 			int amount_Ba = input.nextInt();
		    		 			Fruit Banana= new Fruit("Banana",62,amount_Ba);
		    		 			Banana.getGlisemic();
		    		 			break;
		    		 		case "plum":
		    		 			System.out.print("Enter the amount of plum:" );
		    		 			int amount_Pl = input.nextInt();
		    		 			Fruit Plum= new Fruit("Plum",35,amount_Pl);
		    		 			Plum.getGlisemic();
		    		 			break;
		    		 		case "pineapple":
		    		 			System.out.print("Enter the amount of pineapple:" );
		    		 			int amount_Pi = input.nextInt();
		    		 			Fruit Pineapple= new Fruit("Pineapple",58,amount_Pi);
		    		 			Pineapple.getGlisemic();
		    		 			break;
		    		 		case "watermelon":
		    		 			System.out.print("Enter the amount of watermelon:" );
		    		 			int amount_W = input.nextInt();
		    		 			Fruit Watermelon= new Fruit("Watermelon",72,amount_W);
		    		 			Watermelon.getGlisemic();
		    		 			break;
		    		 		case "grape":
		    		 			System.out.print("Enter the amount of grape:" );
		    		 			int amount_G = input.nextInt();
		    		 			Fruit Grape= new Fruit("Grape",46,amount_G);
		    		 			Grape.getGlisemic();
		    		 			break;
		    		 		case "pear":
		    		 			System.out.print("Enter the amount of pear:" );
		    		 			int amount_Pe = input.nextInt();
		    		 			Fruit Pear= new Fruit("Pear",38,amount_Pe);
		    		 			Pear.getGlisemic();
		    		 			break;
		    		 		default:
		    		 			System.out.println("You entered wrong food name.");
		    		 }
		    	 break;
		    	 case "legume":
		    		 System.out.println("Enter the food:");
		    		 food=input.next();
		    		switch(food.toLowerCase()) {
		    			case "bean":
		    				System.out.print("Enter the amount of bean:" );
	    		 			int amount_Be = input.nextInt();
	    		 			Legume Bean= new Legume("Bean",29,amount_Be);
	    		 			Bean.getGlisemic();
	    		 			break;
		    			case "lentil":
		    				System.out.print("Enter the amount of lentil:" );
	    		 			int amount_ = input.nextInt();
	    		 			Legume Lentil = new Legume("Lentil",30,amount_);
	    		 			Lentil.getGlisemic();
	    		 			break;
		    			case "chickpea":
		    				System.out.print("Enter the amount of chickpea:" );
	    		 			int amount_C = input.nextInt();
	    		 			Legume Chickpea= new Legume("Chickpea",28,amount_C);
	    		 			Chickpea.getGlisemic();
	    		 			break;
		    			case "kidneybean":
		    				System.out.print("Enter the amount kidneybean:" );
	    		 			int amount_K = input.nextInt();
	    		 			Legume Kidneybean= new Legume("Kidneybean",30,amount_K);
	    		 			Kidneybean.getGlisemic();
	    		 			break;
		    			case "soybean":
		    				System.out.print("Enter the amount of soybean:" );
	    		 			int amount_S = input.nextInt();
	    		 			Legume Soybean = new Legume("Soybean",15,amount_S);
	    		 			Soybean.getGlisemic();
	    		 			break;
		    			default:
		    				System.out.println("You entered wrong food name.");
		    		}
                         break;
		    	 case "vegetables":
		    		 System.out.println("Enter the food:");
		    		 food=input.next();
		    		 switch(food.toLowerCase()) {
		    		  	case"peas":
		    		  		System.out.print("Enter the amount of peas:" );
	    		 			int amount_Pe = input.nextInt();
	    		 			Vegetables Peas= new Vegetables("Peas",51,amount_Pe);
	    		 			Peas.getGlisemic();
	    		 			break;
		    		  	case "carrot":
		    		  		System.out.print("Enter the amount of carrot:" );
	    		 			int amount_C = input.nextInt();
	    		 			Vegetables Carrot= new Vegetables("Carrot",35,amount_C);
	    		 			Carrot.getGlisemic();
	    		 			break;
		    		  	case "potato":
		    		  		System.out.print("Enter the amount of potato:" );
	    		 			int amount_Po = input.nextInt();
	    		 			Vegetables Potato= new Vegetables("Potato",82,amount_Po);
	    		 			Potato.getGlisemic();
	    		 			break;
		    		  	case "pumpkin":
		    		  		System.out.print("Enter the amount of pumpkin:" );
	    		 			int amount_Pu = input.nextInt();
	    		 			Vegetables Pumpkin= new Vegetables("Pumpkin",75,amount_Pu);
	    		 			Pumpkin.getGlisemic();
	    		 			break;
		    		  	case "corn":
		    		  		System.out.print("Enter the amount of corn:" );
	    		 			int amount_Co = input.nextInt();
	    		 			Vegetables Corn= new Vegetables("Corn",54,amount_Co);
	    		 			Corn.getGlisemic();
	    		 			break;
	    		 		 default:
	    		 			 System.out.println("You entered wrong food name.");
	    		 				
		    		 }	
		    	 case "beverages":
		    		 System.out.println("Enter the beverage:");
		    		 food=input.next();
		    		 switch(food){
		    		 case "orangejuice":
		    			    System.out.print("Enter the amount of orange juice:" );
	    		 			int amount_OJ = input.nextInt();
	    		 			Beverages OrangeJuice= new Beverages("Orange juice",52,amount_OJ);
	    		 			OrangeJuice.getGlisemic();
	    		 			break;
		    		 case "applejuice":
		    			 System.out.print("Enter the amount of apple juice:" );
	    		 			int amount_AJ = input.nextInt();
	    		 			Beverages AppleJuice= new Beverages("Apple juice",40,amount_AJ);
	    		 			AppleJuice.getGlisemic();
	    		 			break;
		    		 case "lemonade":
		    			 System.out.print("Enter the amount of lemonade:" );
	    		 			int amount_L = input.nextInt();
	    		 			Beverages Lemonade= new Beverages("Lemonade",66,amount_L);
	    		 			Lemonade.getGlisemic();
	    		 			break;
		    		 case "soda":
		    			 System.out.print("Enter the amount of soda:" );
	    		 			int amount_S = input.nextInt();
	    		 			Beverages Soda= new Beverages("Soda",68,amount_S);
	    		 			Soda.getGlisemic();
	    		 			break;
		    		 case "coke":
		    			 	System.out.print("Enter the amount of coke:" );
	    		 			int amount_Co = input.nextInt();
	    		 			Beverages Coke= new Beverages("Coke",63,amount_Co);
	    		 			Coke.getGlisemic();
	    		 			break;
		    		 case "milk":
		    			 System.out.print("Enter the amount of milk:" );
	    		 			int amount_M = input.nextInt();
	    		 			Beverages Milk= new Beverages("Milk",39,amount_M);
	    		 			Milk.getGlisemic();
	    		 			break;
		    		 case "energydrink":
		    			 System.out.print("Enter the amount of energy drink:" );
	    		 			int amount_ED = input.nextInt();
	    		 			Beverages EnergyDrink= new Beverages("Energy drink",78,amount_ED);
	    		 			EnergyDrink.getGlisemic();
	    		 			break;
		    		 case "coffee":
		    			 System.out.print("Enter the amount of coffee:" );
	    		 			int amount_Cof = input.nextInt();
	    		 			Beverages Coffee= new Beverages("Coffee",46,amount_Cof);
	    		 			Coffee.getGlisemic();
	    		 			break;
    		 			
		    		 default:
    		 			 System.out.println("You entered wrong beverage name.");
		    		 }
		    	 default:
		    		   System.out.println("You entered wrong food type.");

		       }
          }
      }
    	

	

