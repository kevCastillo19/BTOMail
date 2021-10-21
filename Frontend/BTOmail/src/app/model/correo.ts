export class Correo {
    idCorreo: number = 0;
    nombreEmisor: string = '';
    correoEmisor: string = '';
    fecha: string = '';
    asunto: string = '';
    mensaje: string = '';
    categoria: boolean = false;
    leido: boolean = false;
    destacado: boolean = false;
    spam: boolean = false;
    eliminado: boolean = false;
    correoReceptor: string = '';

    constructor() {
        this.idCorreo,
        this.nombreEmisor,
        this.correoEmisor,
        this.fecha,
        this.asunto,
        this.mensaje,
        this.categoria,
        this.leido,
        this.destacado,
        this.spam,
        this.eliminado,
        this.correoReceptor

    }

}