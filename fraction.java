class Fraction {
    int num;
    int denum;

    Fraction() {
        num = 1;
        denum = 1;
    }

    
    Fraction(int n) {
        num = n;
        denum = 1;
    }

    
    Fraction(int n, int d) {
        if (d == 0) {
            System.out.println("Denominator cannot be zero.");
            num = 0;
            denum = 1;
        } else {
            num = n;
            denum = d;
        }
    }

 
    Fraction(Fraction f) {
        num = f.num;
        denum = f.denum;
    }

    
    void show() {
        System.out.println(num + "/" + denum);
    }

  
    Fraction add(Fraction f) {
		Fraction b=new Fraction();
        b.num = num * f.denum + denum * f.num; 
        b.denum = denum * f.denum;  
        return b;
		
    }
	Fraction sub(Fraction f) {
		Fraction x=new Fraction();
        x.num = num * f.denum - denum * f.num; 
        x.denum = denum * f.denum;  
        return x;
	}
	Fraction mul(Fraction f) {
		Fraction y=new Fraction();
        y.num = num * f.denum * denum * f.num; 
        y.denum = denum * f.denum;  
        return y;
	}

    public static void main(String[] args) {

        Fraction d1 = new Fraction();
        Fraction d2 = new Fraction(3);
        Fraction d3 = new Fraction(4, 5);


        d1.show();
        d2.show();
        d3.show();


        Fraction result = d1.add(d3);
		Fraction result2=d1.sub(d3);
		Fraction result3=d1.mul(d3);
        result.show();  
		result2.show();
		result3.show();
		
    }
}
