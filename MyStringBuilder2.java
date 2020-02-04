
public class MyStringBuilder2 {
	// add data member
	String mystring = "";
	public MyStringBuilder2() {};
	public MyStringBuilder2(char[] chars) {
		this.mystring = chars.toString();
	};
	public MyStringBuilder2(String s) {
		mystring = s;
	};
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		// modify on mystring
		if (offset < 0)
			return this;
		if (offset >= mystring.length()) {
			// change mystring
			mystring += s.toString();
			return this;
		}
		String newstring = "";
		for (int index=0; index<offset;index++)
			newstring += mystring.charAt(index);
		newstring += s.toString();
		newstring += this.substring(offset + 1).toString();
		this.mystring = newstring;
		return this;
	}
	public MyStringBuilder2 reverse() {
		// can use some techniques used in the above method insert
		return this;
	}
	public MyStringBuilder2 substring(int begin) {
		// can use some techniques used in the above method insert
		
		return this;
	}
	public MyStringBuilder2 toUpperCase() {
		return this;
	}
	public String toString() {
		return mystring;
	}

}
