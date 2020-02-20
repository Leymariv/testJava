public class Test {
    static double pi = 3.14;
    static int c = 99;
    
    static double f(int arg){
	return (pi * arg) - pi;
    }


    static double g(int arg){
	return c + arg - c;
    }


    static double h(int arg){
	int k = 99;
	return k - (arg * k);
    }

    static double res()
    {
	double res = 3 + f(3) + 12 * g(5) - h(6);
	return res;
    }
    
    public static void main(String[] args){
	res();
	return;
    }
    
}
