package TUGAS13;

public class DoubleLinkedLists2 {
     Node2 head;
     int size;
     public DoubleLinkedLists2(){
         head = null;
        size = 0;     
     }
    public boolean isEmpty(){
         return head == null;
     } 
    public void addFirst(Mahasiswa mhs){
          if(isEmpty()){  
              head = new Node2(null,mhs,null);
          }else{
              Node2 newNode = new Node2(null, mhs, head);
              head.prev = newNode;    
              head = newNode; 
          }
          size++; 
      }
    public void addLast(Mahasiswa mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            Node2 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node2 newNode = new Node2(current, mhs, null);
            current.next = newNode;
            size++;
        }
    }    
    public void add(Mahasiswa mhs,int index) throws Exception{ 
         if(isEmpty()){
             addFirst(mhs);
         }else if (index < 0 || index > size){
             throw new Exception("Nilai index di luar batas");
         }else{
             Node2 current = head;
             int i = 0;
             while (i<index){
                 current = current.next; 
                 i++;
             }
             if(current.prev == null){
                 Node2 newNode = new Node2(null, mhs, current);
                 current.prev = newNode;
                 head = newNode;
             }else{
                 Node2 newNode = new Node2 (current.prev, mhs, current);   
                 newNode.prev = current.prev;
                 newNode.next = current;
                 current.prev.next = newNode;
                 current.prev = newNode;
             }
         }  
         size++; 
     }
    public void clear(){ 
          head = null;
          size = 0;
      }
    public void print(){  
           if(!isEmpty()){   
               Node2 tmp = head;  
               while(tmp!=null){  
                   System.out.println(""); 
                   System.out.println("Nama : " + tmp.mhs.nama);  
                   System.out.println("Nilai: " +tmp.mhs.nilai); 
                   tmp = tmp.next;          
               } 
           }else{     
               System.out.println("Linked Lists Kosong"); 
           }     
       }
    public void removeFirst() throws Exception{ 
            if(isEmpty()){       
                throw new Exception("Linked List masih kosong, tidak dapat dihapus");  
            }else if(size==1){      
                removeLast();     
            }else{            
                head = head.next;    
                head.prev = null;        
                size--;         }  
        } 
    public void removeLast() throws Exception{ 
            if(isEmpty()){     
                 throw new Exception("Linked List masih kosong, tidak dapat dihapus");    
            }else if(head.next == null){   
                 head = null;     
                 size--;       
                 return;      
            }  
            Node2 current = head;   
            while (current.next.next != null){  
                 current = current.next; 
             }      
            current.next = null;   
            size--; 
         }
    public void remove(int index) throws Exception{ 
        if (isEmpty() || index >= size){
          throw new Exception("Nilai indeks di luar batas"); 
        }else if(index == 0){ 
             removeFirst(); 
        }else{ 
            Node2 current = head;
            int i = 0;  
            while (i<index){ 
                current = current.next;
                 i++; 
        }
            if(current.next == null){
                current.prev.next = null; 
            }else if(current.prev == null){ 
                current = current.next;
                current.prev = null;
            }else{ 
                current.prev.next = current.next; 
                current.next.prev = current.prev; 
            }
             size--; 
        }
    }
    public String getFirst() throws Exception{ 
        if(isEmpty()){        
            throw new Exception("Linked List kosong");
        }        
        return head.mhs.nama;   
    }   
    public String getLast() throws Exception{ 
        if(isEmpty()){
            throw new Exception("Linked List kosong");  
        }
        Node2 tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.mhs.nama;  
    } 
     public String get(int index)throws Exception{ 
         if(isEmpty() || index>=size){
             throw new Exception("Nilai indeks di luar batas");
         }         
         Node2 tmp = head;   
         for(int i=0; i<index; i++){
             tmp = tmp.next;      
         }        
         return tmp.mhs.nama; 
     } 
     public int getKey(Mahasiswa mhs) throws Exception{ 
         Node2 tmp = head; 
         int i=0,idx=0;         
         while(tmp != null){          
             if (mhs.nilai==tmp.mhs.nilai){
                 idx=i;     
             }   
             tmp = tmp.next;   
             i++;     
         }   
         return idx;    
     } 
      public void bubbleSortDescending() throws Exception{  
          Node2 current;  
          Mahasiswa mhs = new Mahasiswa(); 
          for(int i=0; i<size; i++){  
              current = head;       
              while(current.next != null){  
                  if(current.mhs.nilai < current.next.mhs.nilai){
                      mhs = current.mhs;       
                      current.mhs = current.next.mhs; 
                      current.next.mhs = mhs; 
                  }
                  current = current.next;
              }      
              current = current.prev;
          }         
      } 
}
