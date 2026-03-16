package oop_00000105215_ClemensPutraKusmeri.week07

enum state AppState{
  STARTING, RUNNING, STOPPEDS
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading: ApiResponse()
}