import { Component } from '@angular/core';
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-compb',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './compb.component.html',
  styleUrl: './compb.component.css'
})
export class CompbComponent {
  nombre:string="Databindin Interpolacion";
  urlImagen:string="https://pokemonletsgo.pokemon.com/assets/img/common/char-pikachu.png";

  nomp:string="";
  mostrarAlerta(){
    alert("Holas "+this.nombre);
  }

}
