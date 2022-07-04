package TDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void test1(){
        new Unit(50,25);
    }

    @Test
    public void test2(){
        Unit unit = new Unit(50,25);
        assertEquals(50, unit.getHealth());
    }

    @Test
    public void test3(){
        Unit unit = new Unit (50, 25);
        unit.takeDamage(25);
    }

    @Test
    public void  test4(){
        Unit unit = new Unit(50,25);
        unit.takeDamage(25);
        assertEquals(25,unit.getHealth());
    }

    @Test
    public void test5(){
        Unit unitTom = new  Unit(100,25);
        Unit unitDenis = new  Unit(100,25);
        unitDenis.addDamage(unitTom);
    }

    @Test
    public void test6(){
        Unit unitTom = new  Unit(100,25);
        Unit unitDenis = new  Unit(100,25);
        unitDenis.addDamage(unitTom);
        assertEquals(75, unitTom.getHealth());
    }

}
