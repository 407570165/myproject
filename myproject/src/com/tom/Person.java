p a c k a g e   c o m . t o m ;  
  
 p u b l i c   c l a s s   P e r s o n   {  
  
     f l o a t   w e i g h t ;  
     f l o a t   h e i g h t ;  
  
     p u b l i c   P e r s o n ( f l o a t   w e i g h t , f l o a t   h e i g h t ) {  
 	 t h i s . w e i g h t = w e i g h t ;  
         t h i s . h e i g h t = h e i g h t ;  
 }  
  
  
 p u b l i c   v o i d   h e l l o ( ) {  
 	 S y s t e m . o u t . p r i n t l n ( " H e l l o " ) ;  
 	 	 	  
 }  
 p u b l i c   f l o a t   b m i ( ) {  
 	 f l o a t   b m i = w e i g h t / ( h e i g h t * h e i g h t ) ;  
 	 r e t u r n   b m i ;  
 }  
  
 }  
  
  
 