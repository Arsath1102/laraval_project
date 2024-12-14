<?php
abstract class cars{
    public $year;
    public function __construct($year)
    {
        $this->year=$year;
    }
}
class woner extends cars{

}
class woner2 extends woner{
    
}
$arsath = new woner2("2024");
echo $arsath->year;
?>