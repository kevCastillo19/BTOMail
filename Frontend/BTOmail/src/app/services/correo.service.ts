import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Correo } from '../model/correo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CorreoService {

  url:string = environment.baseUrl;

  correo: Correo = new Correo();

  constructor(private http: HttpClient) { }

  getRecibidos(){
    return this.http.get<Correo[]>(`${this.url}/categoria/0`);
  }

  getEnviados(){
    return this.http.get<Correo[]>(`${this.url}/categoria/1`);
  }

  getDestacados(){
    return this.http.get<Correo[]>(`${this.url}/destacado/1`);
  }

  getSpam(){
    return this.http.get<Correo[]>(`${this.url}/spam/1`);
  }

  getEliminados(){
    return this.http.get<Correo[]>(`${this.url}/eliminado/1`);
  }

  saveCorreo(obj: Correo){
    this.correo.nombreEmisor = obj.nombreEmisor;
    this.correo.correoEmisor = obj.correoEmisor;
    this.correo.asunto = obj.asunto;
    this.correo.mensaje = obj.mensaje;
    this.correo.correoReceptor = obj.correoReceptor;
    this.correo.categoria = true;
    
    return this.http.post<Correo>(this.url+'/nuevo',this.correo);
  }

  updateCorreoDestacado(obj: Correo){
    obj.destacado = !obj.destacado;
    return this.http.put<Correo>(this.url+'/update',obj);
  }

  updateCorreoEliminado(obj: Correo){
    obj.eliminado = !obj.eliminado;
    return this.http.put<Correo>(this.url+'/update',obj);
  }

  updateCorreoLeido(obj: Correo){
    obj.leido = !obj.leido;
    console.log(obj)
    return this.http.put<Correo>(this.url+'/update',obj);
  }

  updateCorreoSpam(obj: Correo){
    obj.spam = !obj.spam;
    return this.http.put<Correo>(this.url+'/update',obj);
  }
}
