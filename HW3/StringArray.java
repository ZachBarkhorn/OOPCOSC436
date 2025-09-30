import java.util.Iterator;

public class StringArray implements Iterable<String> {
    protected String[] strings;
    protected int size;

    public StringArray(String[] values){
        strings = values;
        size = values.length;      
    }

    public Iterator<String> iterator(){
        return new LongStringIterator();
    }
    
        public class ArrayIterator implements Iterator<String>{

        protected int current = 0;

        public boolean hasNext(){
            return current < size;
        }

        public String next(){
            if(!hasNext()){
                throw new java.util.NoSuchElementException();
            }
            
            return strings[current++];
        }

        }

        public class LongStringIterator implements Iterator<String>{

            protected int current = 0;

            private void advanceToNxtValid(){
                while ((current<size) && (strings[current].length()<4)){
                    current++;
                }
            }

            public boolean hasNext(){
                return (current<size) && (strings[current].length()>=4);
            }

            public String next(){
            if(!hasNext()){
                throw new java.util.NoSuchElementException();
            }
            
            String result = strings[current++];
            advanceToNxtValid();
            return result;
            }
        }
}
