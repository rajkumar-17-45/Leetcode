class MyCircularDeque {
    int queue[];
    int f = -1;
    int r = -1;
    int k;
    
    public MyCircularDeque(int k) {
        queue = new int[k];
        this.k = k;
    }
    
    public boolean insertFront(int value) {
        if ((f == 0 && r == k - 1) || (f == r + 1)) {  
            return false;
        } else if (f == -1 && r == -1) {  
            f = r = 0;
        } else if (f == 0) {  
            f = k - 1;
        } else {
            f--;
        }
        queue[f] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if ((f == 0 && r == k - 1) || (f == r + 1)) {  
            return false;
        } else if (f == -1 && r == -1) {  
            f = r = 0;
        } else if (r == k - 1 && f != 0) { 
            r = 0;
        } else {
            r++;
        }
        queue[r] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if (f == -1) { 
            return false;
        } else if (f == r) {  
            f = r = -1;
        } else if (f == k - 1) {  
            f = 0;
        } else {
            f++;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if (f == -1) {
            return false;
        } else if (f == r) {  
            f = r = -1;
        } else if (r == 0) {  
            r = k - 1;
        } else {
            r--;
        }
        return true;
    }
    
    public int getFront() {
        if (f == -1) return -1;  
        return queue[f];
    }
    
    public int getRear() {
        if (r == -1) return -1;  
        return queue[r];
    }
    
    public boolean isEmpty() {
        return f == -1;
    }
    
    public boolean isFull() {
        return (f == 0 && r == k - 1) || (f == r + 1);
    }
}
