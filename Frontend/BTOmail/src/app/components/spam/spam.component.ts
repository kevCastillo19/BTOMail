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

  updateDestacado(obj: Correo){
    this.correoService.updateCorreoDestacado(obj).subscribe(res => {
      console.log(res);
      this.getSpam();
    }, err => console.log(err))
  }

  updateEliminado(obj: Correo){
    this.correoService.updateCorreoEliminado(obj).subscribe(res => {
      console.log(res);
      this.getSpam();
    }, err => console.log(err))
  }

  updateSpam(obj: Correo){
    this.correoService.updateCorreoSpam(obj).subscribe(res => {
      console.log(res);
      this.getSpam();
    }, err => console.log(err))
  }

  updateLeido(obj: Correo){
    this.correoService.updateCorreoLeido(obj).subscribe(res => {
      console.log(res);
      this.getSpam();
    }, err => console.log(err))
  }

}
