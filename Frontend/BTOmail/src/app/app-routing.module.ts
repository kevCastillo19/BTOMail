import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CorreosComponent } from './components/correos/correos.component';
import { EnviadosComponent } from './components/enviados/enviados.component';
import { DestacadosComponent } from './components/destacados/destacados.component';
import { SpamComponent } from './components/spam/spam.component';
import { EliminadosComponent } from './components/eliminados/eliminados.component';

const routes: Routes = [
  { path: 'Correos', component: CorreosComponent },
  { path: 'Enviados', component: EnviadosComponent },
  { path: 'Destacados', component: DestacadosComponent },
  { path: 'Spam', component: SpamComponent },
  { path: 'Eliminados', component: EliminadosComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
