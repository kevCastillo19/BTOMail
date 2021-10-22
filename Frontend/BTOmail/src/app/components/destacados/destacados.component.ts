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

}
