<?php
class student{
    public $name;
    public $mark;
  public function __construct($name,$mark)
    {
        $this->name=$name;
        $this->mark=$mark;

}
public function message(){
    echo "welcom {$this->name} this your mark is :{$this->mark}";
}
}
class school extends student{
    public function intro(){
       echo "this you first php massage of the tamilnadu";
    }
}
class home extends school{
    public function hellow(){
        echo "hello this your default function";
    }

}

$arsath=new home("mohamed arsath v",350);
$arsath->intro();
print $arsath->name;
print $arsath->mark;
?>