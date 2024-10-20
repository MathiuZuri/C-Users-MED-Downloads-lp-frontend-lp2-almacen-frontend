import { Component } from '@angular/core';

@Component({
  selector: 'app-calcbasic',
  standalone: true,
  imports: [],
  templateUrl: './calcbasic.component.html',
  styleUrl: './calcbasic.component.css'
})
export class CalcbasicComponent {
  num1:number=0;
  num2:number=0;
  resultado:number=0;

  getNumber1(e:any):void {
    console.log(e.target.value);
    this.num1 = Number(e.target.value);
  }
  getNumber2(e:any){
    console.log(e.target.value);
    this.num2 = Number(e.target.value);
  }

  sumar(){
    this.resultado =this.num1 + this.num2;
  }
}
