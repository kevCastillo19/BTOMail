import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faEnvelopeOpen } from "@fortawesome/free-solid-svg-icons";
import { CorreoService } from 'src/app/services/correo.service';
import { Correo } from '../../model/correo';
@Component({
  selector: 'app-eliminados',
  templateUrl: './eliminados.component.html',
  styleUrls: ['./eliminados.component.css']
})
export class EliminadosComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faEnvelopeOpen = faEnvelopeOpen;

  p: number = 1;

  eliminados: Correo[] = [];

  constructor(private correoService: CorreoService) { }

  ngOnInit(): void {
    this.getEliminados();
  }

  private getEliminados(){
    this.correoService.getEliminados().subscribe( res => {
      this.eliminados = res;
    }, error => {
      console.log(error);
    })
  }

}
