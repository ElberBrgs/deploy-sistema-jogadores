// src\pages\Lista\index.js

import ListaDeUsuarios from '../../components/ListaDeUsuarios'
import { useNavigate } from 'react-router-dom'
import './styles.css'
import logo from '../../assets/images/logo.png'

function PaginaListaUsuarios() {
    const navigate = useNavigate()
    
return (
        <div className='pagina-lista-jogadores'>
            <div className='container'>
                <img src={logo} alt="Logo do time" />
                <h2>Lista de jogadores</h2>
                <ListaDeUsuarios />
                <button onClick={() => navigate('/cadastro')} className='link-voltar'>
                    Voltar ao cadastro
                </button>
                
                <button onClick={() => navigate('/')} className="link-home">
                    Página inicial
                </button>
            </div>
        </div>
    )
}

export default PaginaListaUsuarios