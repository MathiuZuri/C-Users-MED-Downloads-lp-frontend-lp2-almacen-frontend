import { Routes } from '@angular/router';
import {FormProductoComponent} from "./form-producto/form-producto.component";
import {ListaProductoComponent} from "./lista-producto/lista-producto.component";
import {MainCategoriaComponent} from "./main-categoria/main-categoria.component";
import {MainMarcaComponent} from "./main-marca/main-marca.component";
import {FormMarcaComponent} from "./main-marca/form-marca/form-marca.component";
import {MainUnidadmedidaComponent} from "./main-unidadmedida/main-unidadmedida.component";
import {FormUnidadmedidaComponent} from "./main-unidadmedida/form-unidadmedida/form-unidadmedida.component";
export const pagesRoutes: Routes = [
  {
    path: 'product',
    component: ListaProductoComponent,
    children: [
      { path: 'new', component: FormProductoComponent },
      { path: 'edit/:id', component: FormProductoComponent },
    ],
  },
  { path: 'categoria', component: MainCategoriaComponent },
  //{ path: 'categoria', component: MainCategoriaComponent },
  {
    path: 'marca',
    component: MainMarcaComponent,
    children: [
      { path: 'new', component: FormMarcaComponent },
      { path: 'edit/:id', component: FormMarcaComponent },
    ],
  },
  {
    path: 'unidadmedida',
    component: MainUnidadmedidaComponent,
    children: [
      { path: 'new', component: FormUnidadmedidaComponent },
      { path: 'edit/:id', component: FormUnidadmedidaComponent },
    ],
  },


];
