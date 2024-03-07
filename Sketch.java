import processing.core.PApplet;
/* Description: displays a random season either summer, winter, autum, or spring and either night or day. Also displays the current time
 * 
 * Author: Ryan Ip
 */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  public void settings() {
	// put your size call here
    size(400, 400);
  
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // variables
    float fltSeason = random(0,4);
    float fltSun = random(0,2);

    // flower variables
    float fltFlowerX = random(0, width);
    float fltPetalSize = (50);
    float fltPetalDistance = fltPetalSize / 2;
    float fltGreenPetal = random(0,255);
    float fltRedPetal = random(0,255);
    float fltBluePetal = random(0,255);
    String strSeason;

    
    // summer day
    if (fltSeason <= 1 && fltSun <= 1)  {
     
      // day background
      background(151,225,255);

      // text 
      strSeason = "Summer Day";
      fill(0);
      text(strSeason, width - 390 , height - 380);
      
      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // upper left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // upper right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);
      
      // center petal
      fill(255, 0, 0);
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);
      
      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // sun
      fill(255,176,39);
      ellipse(width - 50, height - 350, 50, 50);
    }  else if (fltSeason <= 1 && fltSun > 1 )  { // summer night
      
      // night background
      background(0,29,255);
      
      // text 
      strSeason = "Summer Night";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // upper left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // upper right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);
      
      // center petal
      fill(255, 0, 0);
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);
      
      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // moon
      fill(201,201,201);

      ellipse(width - 50, height - 350, 50, 50);

    } else if (fltSeason <= 2 && fltSun <= 1 ) { // autum day 
      
      // day background
      background(151,225,255);

      // text 
      strSeason = "Autum Day";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // upper left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // upper right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);
      
      // center petal
      fill(255, 0, 0);
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);
      
      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // sun
      fill(255,176,39);
      ellipse(width - 50, height - 350, 50, 50);
    } else if (fltSeason <= 2 && fltSun > 1 ) { // autum night 
      
      // night background
      background(0,29,255);

      // text 
      strSeason = "Autum Night";
      fill(0);
      text(strSeason, width - 390 , height - 380);
      
      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // upper left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // upper right petal
      ellipse(fltFlowerX + fltPetalDistance, 200 - fltPetalDistance, fltPetalSize, fltPetalSize);

      // lower left petal
      ellipse(fltFlowerX - fltPetalDistance, 200 + fltPetalDistance, fltPetalSize, fltPetalSize);
      
      // center petal
      fill(255, 0, 0);
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);
      
      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // moon
      fill(201,201,201);

      ellipse(width - 50, height - 350, 50, 50);
    } else if (fltSeason <= 3 && fltSun <= 1 ) { // winter day 
      
      // day background
      background(151,225,255);

      // text 
      strSeason = "Winter Day";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // grass
      stroke(0);
      fill(255);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // sun
      fill(255,176,39);
      ellipse(width - 50, height - 350, 50, 50);
    } else if (fltSeason <= 3 && fltSun > 1 ) { // winter night 
      
      // night background
      background(0,29,255);

      // text 
      strSeason = "Winter Night";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // grass
      stroke(0);
      fill(255);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // moon
      fill(201,201,201);
      ellipse(width - 50, height - 350, 50, 50);
    } else if (!(fltSeason < 3  && fltSun > 1)){ // spring day 
      // day background
      background(151,225,255);

      // text 
      strSeason = "Spring Day";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // bud of flower
      fill(255, 0, 0); 
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);

      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // sun
      fill(255,176,39);
      ellipse(width - 50, height - 350, 50, 50); 
    } else { // spring night 
      // night background
      background(0,29,255);

      // text 
      strSeason = "Spring Night";
      fill(0);
      text(strSeason, width - 390 , height - 380);

      // stalk
      fill(0,255,0);
      rect(fltFlowerX - 10,200, 20, 170);
      fill(fltRedPetal, fltGreenPetal, fltBluePetal);

      // bud of flower
      fill(255, 0, 0); 
      ellipse(fltFlowerX, 200, fltPetalSize, fltPetalSize);

      // grass
      stroke(0);
      fill(5, 250, 70);
      triangle(0, height - 30, (float)(width * 0.0375), (float)(height * 0.875 - 30), (float)(width * 0.075), height + 30);
      triangle((float)(width * 0.075), height - 30, (float)(width * 0.113), (float)(height * 0.875 - 30), (float)(width * 0.15), height - 30 );
      triangle((float)(width * 0.15), height - 30, (float)(width * 0.188), (float)(height * 0.875 - 30), (float)(width * 0.225), height - 30);
      triangle((float)(width * 0.225), height - 30, (float)(width * 0.263), (float)(height * 0.875 - 30), (float)(width * 0.3), height - 30);
      triangle((float)(width * 0.3), height - 30, (float)(width * 0.338), (float)(height * 0.875 - 30), (float)(width * 0.375), height - 30);
      triangle((float)(width * 0.375), height - 30, (float)(width * 0.413), (float)(height * 0.875 - 30), (float)(width * 0.45), height - 30);
      triangle((float)(width * 0.45), height - 30, (float)(width * 0.488), (float)(height * 0.875 - 30), (float)(width * 0.525), height - 30);
      triangle((float)(width * 0.525), height - 30, (float)(width * 0.563), (float)(height * 0.875 - 30), (float)(width * 0.6), height - 30);
      triangle((float)(width * 0.6), height - 30, (float)(width * 0.638), (float)(height * 0.875 - 30), (float)(width * 0.675), height - 30);
      triangle((float)(width * 0.675), height - 30, (float)(width * 0.713), (float)(height * 0.875 - 30), (float)(width * 0.75), height - 30);
      triangle((float)(width * 0.75), height - 30, (float)(width * 0.788), (float)(height * 0.875 - 30), (float)(width * 0.825), height - 30);
      triangle((float)(width * 0.825), height - 30, (float)(width * 0.863), (float)(height * 0.875 - 30), (float)(width * 0.9), height - 30);
      triangle((float)(width * 0.9), height - 30, (float)(width * 0.938), (float)(height * 0.875 - 30), (float)(width * 0.975), height - 30);
      triangle((float)(width * 0.975), height - 30, (float)(width * 1.0125), (float)(height * 0.875 - 30), (float)(width * 1.0375), height - 30);
      
      // moon
      fill(201,201,201);
      ellipse(width - 50, height - 350, 50, 50);
    }


    
  }
  public void draw() {
    // time variables 
    int intMinute = minute(); 
    int intHour = hour();
    String time;    

    // Set font properties
    textAlign(LEFT, BOTTOM);
    textSize(16);

    // Format the time as (hours):minutes
    time = intHour + ":" + nf(intMinute, 2);

    // clear old time
    fill(204);
    rect(0, height - 30, width, 30);

    // Draw text representing the current time
    fill(0); 
    text(time, 10, height - 10 ); 
  }
}
