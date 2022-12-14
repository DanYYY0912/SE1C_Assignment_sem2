/*
 * Interface : S t r i n g C o m p a r a t o r
 * 
 * @Name : YUEN Yiu Yeung
 * @StdID: 200171873
 * @Class: IT114105/1C
 * @2021-03-24
 */
public class StringComparator implements Comparator {
    
    public boolean isEqualTo (Object item1, Object item2) {
        return (((String) item1).compareTo((String) item2) == 0);
    }
    
    public boolean isLessThan(Object item1, Object item2) {
        return (((String) item1).compareTo((String) item2) < 0);
    }
    
    public boolean isLessThanOrEqualTo (Object item1, Object item2) {
        return (((String) item1).compareTo((String) item2) <= 0);
    }
    
    public boolean isGreaterThan (Object item1, Object item2) {
        return (((String) item1).compareTo((String) item2) > 0);
    }
    
    public boolean isGreaterThanOrEqualTo (Object item1, Object item2) {
        return (((String) item1).compareTo((String) item2) >= 0);
    }

}