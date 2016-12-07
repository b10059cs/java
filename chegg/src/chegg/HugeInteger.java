package chegg;

public class HugeInteger {
	 private static final int NUM_DIGITS = 40;
	    private int digits[] = new int[NUM_DIGITS];
	    private boolean positive;

	    public HugeInteger(String num) {
	        int len = num.length();
	        if (num.indexOf("-") == 0) {
	            //len--;
	            positive = false;
	        } else {
	            positive = true;
	        }

	        for (int i = 0; i < len; i++) {
	        	if(i+1==len&&!positive){
	        		digits[NUM_DIGITS - i] =-digits[NUM_DIGITS - i];
	        		digits.toString();
	        	}else{
	            digits[NUM_DIGITS - 1 - i] = num.charAt(len - i-1) - (int) '0';
	            digits.toString();
	        	}
	        }
	    }

	    public void multiply(HugeInteger hi) {
	        this.digits = multiplyArraydigits(this.digits, hi.digits);
	    }

	    private int[] multiplyArraydigits(int[] array1, int[] array2) {
	        int[] result = new int[array1.length + array2.length];
	        int carry = 0;
	        int set = 0;

	        for (int i = array1.length - 1; i >= 0; i--) {
	            int temp = result.length - 1 - set;
	            for (int j = array2.length - 1; j >= 0; j--) {
	                int sum = result[temp] + (array1[i] * array2[j]) + carry;
	                result[temp] = sum % 10;
	                carry = sum / 10;
	                temp--;
	            }
	            if (carry > 0) {
	                result[temp] += carry;
	                while (result[temp] >= 10) {
	                    carry = result[temp] / 10;
	                    result[temp] = result[temp] % 10;
	                    result[temp--] += carry;
	                }
	                carry = 0;
	            }
	            set++;
	        }
	        return result;
	    }

	    public void subtract(HugeInteger hi) {
	        // if the signs of the two numbers are not the same
	        if (this.positive != hi.positive) {

	            if (this.positive) { // 'this' is positive...
	                hi.negate();// negates hi temporarily.

	                if (this.isGreaterThan(hi)) { // if this is greater than hi..
	                    this.digits = addArraydigits(this.digits, hi.digits);
	                } else {
	                    this.digits = addArraydigits(hi.digits, this.digits);
	                    this.negate();
	                }
	                // 'this' sign is reverted back to original.
	                hi.negate();

	                // now hi is positive while this is negative...
	            } else {
	                this.negate(); // negates temporarily

	                if (this.isGreaterThan(hi)) { // if this is greater than hi...
	                    this.digits = addArraydigits(this.digits, hi.digits);
	                } else {
	                    this.digits = addArraydigits(hi.digits, this.digits);
	                }
	                this.negate(); 
	            }

	        }

	        else if (!this.positive && !hi.positive) {
	            if (this.isGreaterThan(hi)) {
	                this.digits = subtractArraydigits(this.digits, hi.digits);
	                negate();
	            } else {
	                this.digits = subtractArraydigits(hi.digits, this.digits);
	                this.negate();
	            }
	        }

	        else { // if both are positive
	            if (this.isGreaterThan(hi)) {
	                this.digits = subtractArraydigits(this.digits, hi.digits);
	                negate();
	            } else {
	                this.digits = subtractArraydigits(hi.digits, this.digits); 
	                negate();
	            }
	        }
	    }

	    private void negate() {
	        positive = !positive;
	        return;
	    }

	    public void add(HugeInteger hi) {

	        if (positive != hi.positive) {
	            if (this.positive) {
	                // "this" is positive, hi is negative
	                hi.negate(); // negate hi temporarily
	                if (this.isGreaterThan(hi)) {
	                    this.digits = subtractArraydigits(this.digits, hi.digits);
	                } else {
	                    this.digits = subtractArraydigits(hi.digits, this.digits);
	                    // negate the "this"
	                    negate();
	                }
	                hi.negate(); // restore hi's sign
	            } else {
	                if (this.isGreaterThan(hi)) {
	                    this.digits = subtractArraydigits(this.digits, hi.digits);
	                } else {
	                    this.digits = subtractArraydigits(hi.digits, this.digits);
	                    negate();
	                }
	            }
	        } else {
	            this.digits = addArraydigits(this.digits, hi.digits);
	        }
	    }

	    public boolean isLessThanOrEqualTo(HugeInteger hi) {

	        for (int i = 39; i >= 0; i--) {

	            for (int j = 39; j >= 0; j--) {

	                if (i < j)
	                    return true;
	                else if (i == j) {
	                    for (int k = 0; k <= i; k++) {
	                        if (digits[k] < hi.digits[k])
	                            return true;
	                        else if (digits[k] > hi.digits[k])
	                            return false;
	                    }
	                    return true;
	                }
	            }
	        }
	        return true;
	    }

	    public boolean isGreaterThanOrEqualTo(HugeInteger hi) {
	        for (int i = NUM_DIGITS - 1; i >= 0; i--) {

	            for (int j = NUM_DIGITS - 1; j >= 0; j--) {

	                if (i > j)
	                    return true;
	                else if (i == j) {
	                    for (int k = 0; k <= i; k++) {
	                        if (digits[k] < hi.digits[k])
	                            return false;
	                        else if (digits[k] > hi.digits[k])
	                            return true;
	                    }
	                    return true;
	                }
	            }
	        }
	        return true;
	    }

	    public boolean isLessThan(HugeInteger hi) {
	        for (int i = NUM_DIGITS - 1; i >= 0; i--) {

	            for (int j = NUM_DIGITS - 1; j >= 0; j--) {

	                if (i < j)
	                    return true;
	                else if (i == j) {
	                    for (int k = 0; k <= i; k++) {
	                        if (digits[k] < hi.digits[k])
	                            return true;
	                        else if (digits[k] > hi.digits[k])
	                            return false;
	                    }
	                    return true;
	                }
	            }
	        }
	        return true;
	    }

	    public boolean isGreaterThan(HugeInteger hi) {
	        if (!this.positive && !hi.positive) {
	            for (int i = NUM_DIGITS - 1; i >= 0; i--) {
	                if (i < 40) {
	                    for (int k = 0; k <= i; k++) {
	                        if (digits[k] < hi.digits[k])
	                            return true;
	                        else if (digits[k] > hi.digits[k])
	                            return false;
	                    }
	                }
	            }
	        }
	        if (this.positive && !hi.positive) {
	            return true;
	        }

	        if (!this.positive && hi.positive) {
	            return false;
	        }

	        if (this.positive && !hi.positive) {
	            return true;
	        }

	        if (this.positive && hi.positive) {
	            return true;
	        }

	        return positive;
	    }

	    public boolean isNotEqualTo(HugeInteger h2) {
	        if (h2.digits != this.digits) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean isEqualTo(HugeInteger hi) {

	        if (hi.digits == this.digits) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean isZero(int[] digits) {
	        while (digits.equals(0)) {
	            return true;
	        }
	        return false;
	    }

	    private static int[] addArraydigits(int[] array1, int[] array2) {
	        int carry = 0;
	        int result[] = new int[NUM_DIGITS];
	        for (int i = NUM_DIGITS - 1; i >= 0; i--) {
	        	int sum =0;
	        	/*if(array2[i]<0){
	                sum = array1[i] - array2[i] + carry;
	        	}else{
	        		sum = array1[i] + array2[i] + carry;
	        	}
	            if (sum >= 10) {
	                sum -= 10;
	                carry = 1;
	            } else {
	                carry = 0;
	            }
	            result[i] = sum % 10;
	            */
	            
	            
	            
	         // If necessary add in the contribution of the current object.
	            if (i < NUM_DIGITS)
	              sum += array1[i];

	            // If necessary add in the contribution of other.
	            if (i < NUM_DIGITS)
	              sum += array2[i];

	            sum += carry; // Add in the carry from the last iteration.

	            // Record the result and the carry.
	            result[i] = sum % 10;
	            carry = sum/10;
	          }          
	         
	        
	       return result;

	    }

	    private static int[] subtractArraydigits(int[] array1, int[] array2) {

	        int result[] = new int[NUM_DIGITS];
	        int retrieve = 0; int carry = 0;

	        for (int i = NUM_DIGITS - 1; i >= 0; i--) {
	            int diff = array1[i] - array2[i];;
	            /*if (diff < 0) {
	                retrieve = array1[i] - array2[i] + 10;
	                result[i] = retrieve;
	                int index=i;
	                if(index!=0)
	                array1[index-1] -= 1;
	            } else {
	            	if(array2[i]<0){
	            		retrieve = array1[i] + array2[i];
	            	}else{
	                retrieve = array1[i] - array2[i];
	            	}
	                result[i] = retrieve;
	            }
	        }*/
	        
	        
	     // Initialize the answer to the iteration to the digit of current.
	        // It's guaranteed to exist since we know the current object stores
	        // a larger number.
	        int temp = array1[i];

	        // Subtract the appropriate digit if necessary/
	        if (i < NUM_DIGITS)
	          temp -= array2[i];

	        // Subtract the carry from the last iteration.
	        temp -= carry;
	        
	        carry = 0; // Reset for future calculations.

	        // If temp is too small, you need to borrow.
	        if (temp < 0) {
	          temp = temp + 10;
	          carry = 1;
	        }
	        
	        // Set the current digit - carry has already been set.
	        result[i] = temp;
	      }

	        
	        
	        return result;

	    }

	    public String toString() {
	        String s = "";
	        int i;
	        for (i = 0; i < digits.length - 1; i++) {
	            if (digits[i] != 0)
	                break;
	        }

	        for (int j = i; j < digits.length; j++) {
	            s = s + digits[j];
	        }
	        return String.format("%s", s);
	    }

	}
