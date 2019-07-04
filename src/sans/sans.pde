void setup(){
  size(3000,1000);
 
}
 void draw(){
   
   if(mousePressed){   
   fill(255,0,0);
   }
   else{
     fill(random(256),random(256),random(256));
      line(00, 100, 50, 200);
   }circle(100, 100, 100);
 ellipse(mouseX,mouseY,200,200);
 
 }   
