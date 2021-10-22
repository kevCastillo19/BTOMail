import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt, faEnvelopeOpen } from "@fortawesome/free-solid-svg-icons";
import { CorreoService } from 'src/app/services/correo.service';
import { Correo } from '../../model/correo';
@Component({
  selector: 'app-spam',
  templateUrl: './spam.component.html',
  styleUrls: ['./spam.component.css']
})
export class SpamComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;
  faEnvelopeOpen = faEnvelopeOpen;

  p: number = 1;

  spams: Correo[] = [];

  constructor(private correoService: CorreoService) { }

  ngOnInit(): void {
    this.getSpam();
  }

  private getSpam(){
    this.correoService.getSpam().subscribe( res => {
      this.spams = res;
    }, error => {
      console.log(error);
    })
  }

}
