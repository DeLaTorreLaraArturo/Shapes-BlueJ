
class Casa
{
    //Variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta1;
    Square puerta2;
    
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta1 = new Square();
        puerta2 = new Square();
    }
    
    void dibujate()
    {
        pared.makeVisible();
        puerta1.makeVisible();
        puerta2.makeVisible();
        techo.makeVisible();
        ventana.makeVisible();
    }
    
    void acomodate()
    {
        techo.changeSize(100, 200);
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        
        pared.changeSize(115);
        pared.moveDown();
        pared.moveDown();
        pared.moveDown();
        pared.slowMoveHorizontal(12);
        
        puerta1.changeSize(30);
        puerta1.changeColor("yellow");
        puerta1.slowMoveVertical(145);
        puerta1.slowMoveHorizontal(55);
        
        puerta2.changeSize(30);
        puerta2.changeColor("yellow");
        puerta2.slowMoveVertical(120);
        puerta2.slowMoveHorizontal(55);
        
        ventana.changeSize(45);
        ventana.slowMoveHorizontal(85);
    }
}