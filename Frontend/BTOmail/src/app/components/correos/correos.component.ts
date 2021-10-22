import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt, faEnvelopeOpen } from "@fortawesome/free-solid-svg-icons";
import { CorreoService } from 'src/app/services/correo.service';
import { Correo } from '../../model/correo';
@Component({
  selector: 'app-correos',
  templateUrl: './correos.component.html',
  styleUrls: ['./correos.component.css']
})
export class CorreosComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;
  faEnvelopeOpen = faEnvelopeOpen;

  p: number = 1;

  recibidos: Correo[] = [];

  constructor(private correoService: CorreoService) { }

  ngOnInit(): void {
    this.getRecibidos();
  }

  private getRecibidos(){
    this.correoService.getRecibidos().subscribe(res => {
      this.recibidos = res;
    }, error => {
      console.log(error);
    })
  }
  
}
