import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt, faEnvelopeOpen } from "@fortawesome/free-solid-svg-icons";
import { CorreoService } from 'src/app/services/correo.service';
import { Correo } from '../../model/correo';
@Component({
  selector: 'app-destacados',
  templateUrl: './destacados.component.html',
  styleUrls: ['./destacados.component.css']
})
export class DestacadosComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;
  faEnvelopeOpen = faEnvelopeOpen;

  p: number = 1;

  destacados: Correo[] = [];

  constructor(private correoService: CorreoService) { }

  ngOnInit(): void {
    this.getEnviados();
  }

  private getEnviados(){
    this.correoService.getDestacados().subscribe( res => {
      this.destacados = res;
    }, error => {
      console.log(error);
    })
  }

  updateDestacado(obj: Correo){
    this.correoService.updateCorreoDestacado(obj).subscribe(res => {
      console.log(res);
      this.getEnviados();
    }, err => console.log(err))
  }

  updateEliminado(obj: Correo){
    this.correoService.updateCorreoEliminado(obj).subscribe(res => {
      console.log(res);
      this.getEnviados();
    }, err => console.log(err))
  }

  updateSpam(obj: Correo){
    this.correoService.updateCorreoSpam(obj).subscribe(res => {
      console.log(res);
      this.getEnviados();
    }, err => console.log(err))
  }

  updateLeido(obj: Correo){
    this.correoService.updateCorreoLeido(obj).subscribe(res => {
      console.log(res);
      this.getEnviados();
    }, err => console.log(err))
  }

}
