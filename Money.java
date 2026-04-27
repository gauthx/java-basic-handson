// Money.java

class Money{
  final int value;
  Money(int initial){
    this.value = initial;
  }

  Money add(Money Toadd){
    return new Money(this.value + Toadd.value);
  }

  Money minus(Money ToSubtract){
     return new Money(this.value - ToSubtract.value);
  }
  
}