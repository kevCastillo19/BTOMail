import { Component, OnInit } from '@angular/core';
import { faEnvelope, faPaperPlane, faStar, faExclamationTriangle, faTrashAlt } from "@fortawesome/free-solid-svg-icons";
import { RouterLinkActive } from '@angular/router';
import { CorreoService } from 'src/app/services/correo.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Correo } from 'src/app/model/correo';
@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  faEnvelope = faEnvelope; 
  faPaperPlane = faPaperPlane; 
  faStar = faStar; 
  faExclamationTriangle = faExclamationTriangle; 
  faTrashAlt = faTrashAlt;
  RouterLinkActive = RouterLinkActive;
  
  modal:boolean = false;

  correo: Correo = new Correo();
  correoNuevoFrm: FormGroup;

  constructor(private fb:FormBuilder, private correoService: CorreoService) {
    this.correoNuevoFrm=this.fb.group({
      nombreEmisor:['',Validators.required],
      correoEmisor:['',Validators.required],
      correoReceptor:['',Validators.required],
      asunto:['',Validators.required],
      mensaje:['',Validators.required]
    });
  }

  ngOnInit(): void {
    this.correoNuevoFrm=this.fb.group({
      nombreEmisor:['',Validators.required],
      correoEmisor:['',Validators.required],
      correoReceptor:['',Validators.required],
      asunto:['',Validators.required],
      mensaje:['',Validators.required]
    });
  }

  abrirModal(){
    this.modal=true;
  }

  cerrarModal(){
    this.modal=false;
  }
  
  agregarCorreo(){
    this.correo = this.correoNuevoFrm.value as Correo;
    this.correoService.saveCorreo(this.correo).subscribe(res => {
      console.log(res);
    }, err => {
      console.log(err);
    })
    this.correoNuevoFrm.reset();
    this.cerrarModal();
  }
}
