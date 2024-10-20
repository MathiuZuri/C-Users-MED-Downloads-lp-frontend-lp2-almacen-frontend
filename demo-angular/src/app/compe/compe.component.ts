import { Component } from '@angular/core';

@Component({
  selector: 'app-compe',
  standalone: true,
  imports: [],
  templateUrl: './compe.component.html',
  styleUrl: './compe.component.css'
})
export class CompeComponent {

  hacerAlgo() {
    console.log('Hola Mundo Angular 18');
  }
  onChange(event: any){
    console.log('Change..', event.target.value);
  }
  onKeydown(event: any){
    console.log('onKeydown..', event.target.value);
  }
  onKeyup(event: any){
    console.log('Keyup..', event.target.value);
  }
  onInput(event: any) {
    console.log('Valor ingresado:', event.target.value);
  }
  onWheel(event: any){
    console.log('Wheel...', event.target.value);
  }
  onMouseOver(){
    console.log('onMouseOver');
  }
  onRightClick(event: any){
    console.log('RightClick..', event.target.value);
  }
  onSubmit(){
    console.log('Submit');
  }
  onClick() {
    console.log('Botón clicado');
  }
  onDoubleClick() {
    console.log('Botón doble clicado');
  }
  onMouseOut(){
    console.log('onMouseOut');
  }
  onFocus() {
    console.log('Input recibió foco');
  }
  onBlur() {
    console.log('Input perdió foco');
  }
  onMouseEnter() {
    console.log('Mouse entró al área');
  }
  onMouseLeave() {
    console.log('Mouse salió del área');
  }



}
